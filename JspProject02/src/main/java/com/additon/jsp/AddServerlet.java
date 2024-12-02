package com.additon.jsp;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServerlet extends HttpServlet {

//	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		res.getWriter().println("The sum of "+i +" and "+ j + " is " + (int)i+(int)j);
//		
//	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		res.getWriter().println("The sum of "+i +" and "+ j + " is " + (int)i+(int)j);
		
	}
}
