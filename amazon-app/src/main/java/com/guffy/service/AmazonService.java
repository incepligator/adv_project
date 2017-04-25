package com.guffy.service;

import com.guffy.vo.AmazonVO;

public interface AmazonService {

	AmazonVO findAmazonByid(final Long pk);

	AmazonVO saveAmazonProduct(final AmazonVO vo);

}
