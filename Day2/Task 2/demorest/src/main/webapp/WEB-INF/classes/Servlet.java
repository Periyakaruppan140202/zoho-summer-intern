package com.jersey.demorest;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;

public class Servlet implements ContainerRequestFilter, ContainerResponseFilter {
	@Override
	public void filter(ContainerRequestContext req) throws IOException {
		System.out.println("Request Headers:");
		System.out.println("Headers: " + req.getHeaders());
	}

	@Override
	public void filter(ContainerRequestContext req, ContainerResponseContext res) throws IOException {
		System.out.println("Response Headers:");
		System.out.println("Headers: " + res.getHeaders());
	}
}