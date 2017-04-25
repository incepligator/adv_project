package com.guffy.service;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

			vo.setUpc(UUID.randomUUID().toString());

			entity = mapper.mapToAmazonEntity(vo);

		} else {

			entity = em.find(AmazonEntity.class, vo.getPk());
			entity = mapper.mapToAmazonEntity(entity, vo);

		}
		em.persist(entity);
		vo.setPk(entity.getPk());
		return vo;

	}

}
