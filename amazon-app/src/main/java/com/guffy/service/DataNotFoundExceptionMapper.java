package com.guffy.service;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.guffy.exception.DataNotFoundException;
import com.guffy.vo.ErrorResponse;

@Component
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	public Response toResponse(final DataNotFoundException exception) {

		ErrorResponse errResp = new ErrorResponse();
		errResp.setErrorCode("ERR-VAL-404");
		errResp.setErrorDesc(exception.getMessage());

		return Response.serverError().entity(errResp).build();

	}

}
