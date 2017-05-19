package com.guffy.service;

import java.util.List;

import com.guffy.vo.AmazonVO;

public interface AmazonService {

	AmazonVO findAmazonByid(final Long pk);

	AmazonVO saveAmazonProduct(final AmazonVO vo);

	List<AmazonVO> searchProducts(final String name);

	void removeProduct(final Long pk);

	Long checkDuplicateName(final String name);

	Long checkDuplicateUPC(final String upc);

}
