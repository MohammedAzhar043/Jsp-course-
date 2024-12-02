package com.jsp.learning;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ContextAndConfig  extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.getWriter().println("hiii");
		ServletConfig con = getServletConfig();
		String name = con.getInitParameter("Name");
		res.getWriter().println("My name is "+name);
	}
}
