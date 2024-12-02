package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
	int  i = Integer.parseInt(req.getParameter("number1"));
	int  j = Integer.parseInt(req.getParameter("number2"));
	int k = i +j;
	
	//this is for RequestDispatcher
//	req.setAttribute("k", k);
//	RequestDispatcher rd = req.getRequestDispatcher("sq");
//	rd.forward(req, res);
	
//	PrintWriter out = res.getWriter();
//	out.println("we are in AddServlet");
//	url reWriting
	res.sendRedirect("sq?k="+k);

	}
}
