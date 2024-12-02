package com.jsp.learning.revision;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareOfNumber extends HttpServlet
{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		
//		int i = (int) req.getAttribute("k");
//		i = i*i;
//		res.getWriter().println("we are in square servelt and the square  of the number is "+i);
		
//		int i = Integer.parseInt(req.getParameter("k"));
//		res.getWriter().println("we are in square servelt and the square  of the number is " + i*i);
		
		HttpSession session = req.getSession();
		int i = (int) session.getAttribute("k");
		res.getWriter().println("we are in square servelt and the square  of the number is " +i*i );
		
		
	}
}
