package com.Bazalytskyi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
// @WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String form="<form action='HelloServlet' method='post'>";
		form+="<input type='text' name='name' id='name' value='Mike'>";
		form+="<input type='password' name='pass' id='pass'>";
		form+="<input type='submit' value='Log'>";
		response.getWriter().println(form);
		response.setContentType("text/html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		if(request.getParameter("name").equals("Mike")&&request.getParameter("pass").equals("111")){
			response.getWriter().println("Hello");

		}else{
			response.getWriter().println("failed");
		}

		

	}

}