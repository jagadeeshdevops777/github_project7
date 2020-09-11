package com.jaggu.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search")
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int i=Integer.parseInt(request.getParameter("ds"));
		RequestDispatcher rd=null;
		if(i<10 && i>6)
		{
			rd=request.getRequestDispatcher("morning.html");
			rd.forward(request, response);
		}
		else
		{
			if(i<4 && i>10)
			{
				rd=request.getRequestDispatcher("afternoon.html");
				rd.forward(request, response);
			}
			else
			{
				rd=request.getRequestDispatcher("evening.html");
				rd.forward(request, response);
			}
		}
		
		
		
	}

}
