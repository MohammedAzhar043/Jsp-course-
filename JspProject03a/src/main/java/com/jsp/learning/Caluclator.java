package com.jsp.learning;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Caluclator extends HttpServlet {

		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			int i = Integer.parseInt(req.getParameter("number1"));
			int j = Integer.parseInt(req.getParameter("number2"));
			
			int k = i+j;
//			url rewriting
			res.sendRedirect("sq?k="+k);
//			req.setAttribute("k", k);
//			System.out.println(k);
//			
//			RequestDispatcher rd = req.getRequestDispatcher("sq");
//			rd.forward(req, res);
			
		}
}
