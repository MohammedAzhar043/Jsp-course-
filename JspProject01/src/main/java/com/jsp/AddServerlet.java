package com.jsp;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServerlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

	int i= Integer.parseInt(req.getParameter("number1"));
	int j= Integer.parseInt(req.getParameter("number2"));
	int k = i+j;
	res.getWriter().println("The sum of "+i+" and "+j+" is "+ k);
	System.out.println("The sum of "+i+" and "+j+" is "+ k);
	}
}
