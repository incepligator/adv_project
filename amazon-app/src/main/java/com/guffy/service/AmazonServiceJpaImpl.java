package com.guffy.service;

import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guffy.entity.AmazonEntity;
import com.guffy.exception.DuplicateException;
import com.guffy.rest.AmazonRest;
import com.guffy.vo.AmazonVO;

@Service
@Transactional
public class AmazonServiceJpaImpl implements AmazonService {

	private static final Logger logger = LoggerFactory.getLogger(AmazonRest.class);

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private AmazonMapper mapper;

	public AmazonVO findAmazonByid(Long pk) {

		logger.debug("Entering AmazonServiceJpaImpl.findAmazonByid");

		AmazonEntity entity = em.find(AmazonEntity.class, pk);

		logger.debug("Exiting  AmazonServiceJpaImpl.findAmazonByid");

		return mapper.mapToAmazonVO(entity);
	}

	public AmazonVO saveAmazonProduct(AmazonVO vo) {

		AmazonEntity entity = null;

		if (vo.getPk() == null) {

			if (checkDuplicateName(vo.getPname()) >= 1) {

				String err = "Duplicate Name Post";

				throw new DuplicateException(err);

			}
			if (checkDuplicateUPC(vo.getUpc()) >= 1) {

				String err = "Duplicate UPC Post";

				throw new DuplicateException(err);

			}

			// vo.setPnumber(UUID.randomUUID().toString());

			entity = mapper.mapToAmazonEntity(vo);

		} else {

			entity = em.find(AmazonEntity.class, vo.getPk());
			entity = mapper.mapToAmazonEntity(entity, vo);

		}

		em.persist(entity);
		vo.setPk(entity.getPk());
		return vo;

	}

	public List<AmazonVO> searchProducts(String name) {

		List<AmazonEntity> entities;

		String queryParam = name.trim() + "%";

		TypedQuery<AmazonEntity> query = em.createNamedQuery("amazonProducts.search", AmazonEntity.class);

		query.setParameter("p1", queryParam);
		query.setParameter("p2", queryParam);
		query.setParameter("p3", queryParam);

		entities = query.getResultList();

		return mapper.mapToAmazonVOList(entities);
	}

	public void removeProduct(Long pk) {

		AmazonEntity entity = em.find(AmazonEntity.class, pk);

		em.remove(entity);

	}

	public Long checkDuplicateName(String name) {

		String queryParam = name.trim();

		TypedQuery<AmazonEntity> query = em.createNamedQuery("amazonProductsName.search", AmazonEntity.class);

		query.setParameter("p1", queryParam);

		List entities = query.getResultList();

		Long count = (long) entities.size();

		return count;
	}

	public Long checkDuplicateUPC(String upc) {

		TypedQuery<AmazonEntity> query = em.createNamedQuery("amazonProductsUPC.search", AmazonEntity.class);

		query.setParameter("p1", upc.trim());

		return (long) query.getResultList().size();

	}

}
