package com.homedepot.cloud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 189345729387430L;

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	private String message;

	  public void init() throws ServletException
	  {
	      // Do required initialization
	      message = "Hello Nikesh, Welcome to Travis CI!!";
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	  }
	  
	  public void destroy()
	  {
	      // do nothing.
	  }

}
