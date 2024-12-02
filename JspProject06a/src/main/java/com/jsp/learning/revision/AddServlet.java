package com.jsp.learning.revision;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import org.apache.tomcat.util.http.parser.Cookie;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
//		int i =Integer.parseInt( req.getParameter("number1"));
//		int j =Integer.parseInt( req.getParameter("number2"));
//		
//		int k = i +j;
//		res.getWriter().println("The sum of " + i+ "  and " + j +" is "+ k);
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
//		res.sendRedirect("sq?k=" +k);
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
		
//		Cookie cookie = new Cookie("k", k+"") ;
//		res.addCookie(cookie);
//		res.sendRedirect("sq");
		
//		ServletConfig and ServletContext
//		ServletContext you can use the <context-param>
		ServletContext con = req.getServletContext();
		String myName = con.getInitParameter("Name");
		String myphone = con.getInitParameter("phone");
		PrintWriter obj =  res.getWriter();
		obj.println("My Name is "+ myName);
		obj.println("My phone is "+ myphone);
		
		ServletConfig config = getServletConfig();
		String name  =config.getInitParameter("Name");
		obj.println("My name is "+ name);
	}
}
