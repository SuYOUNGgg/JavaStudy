package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/LocalTestServlet")
public class LocalTestServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int number=0;
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		while(number++ < 100) {
			out.print(number + "<br>");
			out.flush();
			try {
				Thread.sleep(1000);//값이 1000인 것은 1초 동안 잠시 멈추는 것을 의미한다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
