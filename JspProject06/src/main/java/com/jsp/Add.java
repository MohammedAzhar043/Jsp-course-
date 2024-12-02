package com.jsp;

import java.io.IOException;

import org.apache.tomcat.util.http.parser.Cookie;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Add extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("name1"));
		int j = Integer.parseInt(req.getParameter("name2"));
		
		int k = i +j;
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
//		res.getWriter().println("we are in add");
		
//		Cookie cookie = new Cookie() ;
		Cookie cookie = new Cookie("k", k+"") ;
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}
