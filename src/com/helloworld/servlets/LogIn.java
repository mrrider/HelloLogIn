package com.helloworld.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogIn extends HttpServlet {
	
	private String login = "admin";
	private String password = "admin";
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String user = req.getParameter("login");
		String pass = req.getParameter("pass");
		if (login.equals(user) && password.equals(pass)) {
			response(resp, "Hello, " + user + "!");
		} else if(!login.equals(user)){
			response(resp, "You input invalid login");
		}
		else {
			response(resp, "You input invalid password");
		}
	}

	private void response(HttpServletResponse resp, String msg)
			throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello</title>");
		out.println("</head>");
		out.println("<body style=\"background-color: #e9f1ff;\">");
		out.println("<h1 style=\"color: #6e90c6; width: 100%; text-align: center; margin-top: 150px; font-family: sans-serif;\">" + msg + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
