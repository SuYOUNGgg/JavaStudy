package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/SessionTestServlet")
public class SessionTestServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String param = req.getParameter("p");
		String msg = null;
		HttpSession session = null;
		
		if(param.equals("create")) {
			session = req.getSession();
			if(session.isNew()) {
				msg="���ο� ���� ��ü�� ������";
			}else {
				msg ="������ ���� ��ü�� ���ϵ�";
			}
		} else if(param.equals("delete")) {
			session = req.getSession(false);
			if(session != null) {
				session.invalidate();
				msg="���� ��ü ���� �۾� �Ϸ�";
			} else {
				msg="������ ���� �������� ����";
				}				
		} else if(param.equals("add")) {
				session = req.getSession(true);
				session.setAttribute("msg", "�޽����Դϴ�.");
				msg = "���� ��ü�� ������ ��� �Ϸ�";
			} else if(param.equals("get")) {
				session = req.getSession(false);
				if(session != null) {
					String str = (String) session.getAttribute("msg");
					msg = str;
				} else {
					msg = "�����͸� ������ ���� ��ü �������� ����";
				} 
			} else if(param.equals("remove")) {
				session = req.getSession(false);
				if(session != null) {
					session.removeAttribute("msg");
					msg = "���� ��ü�� ������ ���� �Ϸ�";
				} else {
					msg = "�����͸� ������ ���� ��ü �������� ����";
				}
			} else if(param.equals("replace")) {
				session = req.getSession();
				session.setAttribute("msg", "���ο� �޽����Դϴ�.");
				msg = "���� ��ü�� ������ ��� �Ϸ�";
			}
			out.print("ó�� ��� : " + msg);
			out.close();
		}
		
		
	}