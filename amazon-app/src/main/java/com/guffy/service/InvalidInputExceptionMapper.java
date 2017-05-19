package com.guffy.service;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.guffy.exception.InvalidInputException;
import com.guffy.vo.ErrorResponse;

@Component
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class InvalidInputExceptionMapper implements ExceptionMapper<InvalidInputException> {

	private static final Logger logger = LoggerFactory.getLogger(InvalidInputExceptionMapper.class);

	public Response toResponse(InvalidInputException exception) {

		logger.error("Exception Occurred: {}", exception);

		ErrorResponse errRsp = new ErrorResponse();

		errRsp.setErrorCode("ERR-VAL-422");
		errRsp.setErrorDesc(exception.getMessage());

		return Response.serverError().entity(errRsp).build();
	}

}
