package com.guffy.service;

import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guffy.entity.AmazonEntity;

import com.guffy.vo.AmazonVO;

@Service
@Transactional
public class AmazonServiceJpaImpl implements AmazonService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private AmazonMapper mapper;

	public AmazonVO findAmazonByid(Long pk) {

		AmazonEntity entity = em.find(AmazonEntity.class, pk);

		return mapper.mapToAmazonVO(entity);
	}

	public AmazonVO saveAmazonProduct(AmazonVO vo) {

		AmazonEntity entity = null;

		if (vo.getPk() == null) {

			vo.setPnumber(UUID.randomUUID().toString());

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

}
