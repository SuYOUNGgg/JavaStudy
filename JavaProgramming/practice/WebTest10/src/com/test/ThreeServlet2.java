package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;;

public class ThreeServlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service started");
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		out.print("<html><body>Three Servlet");
		out.print("</body></html>");	
	}

}
