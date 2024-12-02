package com.jsp.learning;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Square extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		
//		int k = (int) req.getAttribute("k");
//		k = k*k;
		int k = Integer.parseInt(req.getParameter("k"));
		k = k * k;
		PrintWriter a = res.getWriter();
		a.println("The square of a number is "+ k);
		a.println("sq called");
		
	}
}
