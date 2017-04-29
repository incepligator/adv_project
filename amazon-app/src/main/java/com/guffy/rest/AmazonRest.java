package com.guffy.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guffy.service.AmazonService;
import com.guffy.vo.AmazonSearchProducts;
import com.guffy.vo.AmazonVO;

@Service
@Path("/amazon")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AmazonRest {

	@Autowired
	private AmazonService service;

	@GET
	@Path("/{id}")
	public Response findProduct(@PathParam("id") final Long pk) {

		AmazonVO result = service.findAmazonByid(pk);

		return Response.ok().entity(result).build();

	}

	@POST
	public Response saveAmazon(final AmazonVO vo) {

		AmazonVO result = service.saveAmazonProduct(vo);

		return Response.ok().entity(result).build();

	}

	@PUT
	public Response updateAmazon(final AmazonVO vo) {

		AmazonVO result = service.saveAmazonProduct(vo);

		return Response.ok().entity(result).build();
	}

	@GET

	public Response searchAmazon(@QueryParam("searchStr") final String name) {

		List<AmazonVO> results = service.searchProducts(name);

		AmazonSearchProducts entity = new AmazonSearchProducts();

		entity.setProducts(results);

		return Response.ok().entity(entity).build();

	}

	@DELETE
	@Path("/{pk}")
	public Response removeProducts(@PathParam("pk") final Long pk) {

		service.removeProduct(pk);

		return Response.noContent().build();

	}
}
