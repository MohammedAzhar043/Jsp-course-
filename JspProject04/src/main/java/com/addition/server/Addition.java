package com.addition.server;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
	int i =	Integer.parseInt(req.getParameter("num1"));
	int j =	Integer.parseInt(req.getParameter("num1"));
	
//	This entire code for RequestDispatcher
//	int k = i +j;
//	req.setAttribute("k", k);
//	RequestDispatcher rd = req.getRequestDispatcher("sq");
//	rd.forward(req, res);
	
//	This is for sendRedirect
	int k = i +j;
	res.sendRedirect("sq?k="+k);

//	note
//	In the RequestDispatcher we are using the request object where as in the sendRedirect we are using the response object
	}
}
