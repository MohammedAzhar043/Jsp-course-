package com.addition.server;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Square extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 	
//		This is for RequestDispatcher
//		int i = (int) req.getAttribute("k");
//		i = i*i;
//		PrintWriter obj = res.getWriter();
//		obj.println("The square of the number is "+ i);
		
		
		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k;
		PrintWriter obj = res.getWriter();
		obj.println("The square of the number is  " + k);
	}

}
