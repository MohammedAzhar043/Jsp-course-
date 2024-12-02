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

public class Add extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		int i = Integer.parseInt(req.getParameter("number1"));
		int j = Integer.parseInt(req.getParameter("number2"));
		int k = i +j;
		//requestDispatcher
//		 req.setAttribute("k", k);
//		 RequestDispatcher rd = req.getRequestDispatcher("sq");
//		 rd.forward(req, res);
		
//		 url rewriting
//		 res.sendRedirect("sq?k="+k);
		
//		session
//		HttpSession session = req.getSession();
//		session.setAttribute("k",k);
//		res.sendRedirect("sq");
		
//		by using cookies
		Cookie cookie = new Cookie("k", k+"") ;
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}
