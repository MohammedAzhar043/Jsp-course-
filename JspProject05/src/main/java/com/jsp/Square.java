package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Square extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
//		this is for RequestDispatcher
//		int i = (int) req.getAttribute("k");
//		i = i *i;
//		PrintWriter obj = res.getWriter();
//		obj.println("The square of the number is "+ i);
		
//		 by using res.sendRedirect();
//		int i = Integer.parseInt(req.getParameter("k"));
//		i = i *i;
//		PrintWriter obj = res.getWriter();
//		obj.println("we are in ssquare  "+i);
		
		
//		by using sessions 
//		HttpSession session = req.getSession();
//		session.removeAttribute("k");
//		int k = (int) session.getAttribute("k");
//		k = k * k;
//		PrintWriter obj = res.getWriter();
//		obj.println("we are in square  " + k );

//		by using cookies
//		int k =0;
//		Cookie cookie[] = req.getCookies();
//		for(Cookie c : cookie) {
//			if(c.getName().equals("k")) {
//			 k =	Integer.parseInt(c.getValue());
//			}
//		}
//		k = k*k;
//		PrintWriter obj = res.getWriter();
//		obj.println("we are in square  " + k );
		

		
}
}
