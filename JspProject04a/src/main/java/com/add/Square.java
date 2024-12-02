package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class Square extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  {

//		this is for RequestDispatcher
//		int i = (int)	req.getAttribute("k");
//		i = i *i;
//		PrintWriter out = res.getWriter();
//		out.println("The square of the given number is : "+i);
		
		
		int i = Integer.parseInt( req.getParameter("k"));
		i = i*i;
		PrintWriter out = res.getWriter();
		out.println("we are in the square class "+i);
	}

}