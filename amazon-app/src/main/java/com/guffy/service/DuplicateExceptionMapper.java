package com.guffy.service;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.guffy.exception.DuplicateException;
import com.guffy.vo.ErrorResponse;

@Component
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class DuplicateExceptionMapper implements ExceptionMapper<DuplicateException> {

	public DuplicateExceptionMapper() {

	}

	public Response toResponse(final DuplicateException exception) {

		ErrorResponse errRsp = new ErrorResponse();

		errRsp.setErrorCode("ERR-VAL-409");
		errRsp.setErrorDesc(exception.getMessage());

		return Response.serverError().entity(errRsp).build();
	}

}
