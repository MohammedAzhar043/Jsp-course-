package com.jsp;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServerlet extends HttpServlet 
{

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		int i = Integer.parseInt(request.getParameter("n1"));
		int j = Integer.parseInt(request.getParameter("n2"));
		
		int k = i+j;
		response.getWriter().println(k);
		System.out.println(k);
	}
}
