package com.guffy.service;

import org.springframework.stereotype.Component;

import com.guffy.entity.AmazonEntity;
import com.guffy.vo.AmazonVO;

@Component
public class AmazonMapper {

	public AmazonVO mapToAmazonVO(final AmazonEntity entity) {

		AmazonVO vo = new AmazonVO();

		vo.setPk(entity.getPk());
		vo.setPname(entity.getPname());
		vo.setPnumber(entity.getPnumber());
		vo.setUpc(entity.getUpc());
		vo.setCategory(entity.getCategory());
		vo.setDesc(entity.getDesc());
		vo.setManufac(entity.getManufac());
		vo.setVersion(entity.getVersion());
		vo.setActiveDate(entity.getActiveDate());
		vo.setInactiveDate(entity.getInactiveDate());
		vo.setCreateDate(entity.getCreateDate());
		vo.setPquantity(entity.getPquantity());
		vo.setPthreshold(entity.getPthreshold());
		vo.setPorderQuantity(entity.getPorderQuantity());
		vo.setPrice(entity.getPrice());

		return vo;

	}

	public AmazonEntity mapToAmazonEntity(final AmazonEntity entity, AmazonVO input) {

		entity.setPk(input.getPk());
		entity.setPname(input.getPname());
		entity.setPnumber(input.getPnumber());
		entity.setUpc(input.getUpc());
		entity.setCategory(input.getCategory());
		entity.setDesc(input.getDesc());
		entity.setManufac(input.getManufac());
		entity.setVersion(input.getVersion());
		entity.setActiveDate(input.getActiveDate());
		entity.setInactiveDate(input.getInactiveDate());
		entity.setCreateDate(input.getCreateDate());
		entity.setPquantity(input.getPquantity());
		entity.setPthreshold(input.getPthreshold());
		entity.setPorderQuantity(input.getPorderQuantity());
		entity.setPrice(input.getPrice());

		return entity;

	}

	public AmazonEntity mapToAmazonEntity(final AmazonVO input) {

		return mapToAmazonEntity(new AmazonEntity(), input);

	}

}
