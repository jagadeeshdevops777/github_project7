package com.jaggu.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class RegistarationController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sname=request.getParameter("sname");
		String semail=request.getParameter("email");
		String smobile=request.getParameter("mobile");
		int price=Integer.parseInt(request.getParameter("price"));
		out.println("<html>");
		out.println("<h2>Registration Details</h2>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td>"+sname+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+semail+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+smobile+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+price+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</html>");
	}

}
