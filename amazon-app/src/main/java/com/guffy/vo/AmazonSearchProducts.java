package com.guffy.vo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AmazonSearchProducts {

	private List<AmazonVO> products;

	public List<AmazonVO> getProducts() {

		if (products == null) {

			products = new ArrayList<AmazonVO>();

		}

		return products;
	}

	public void setProducts(List<AmazonVO> products) {

		this.products = products;

	}

}
