/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2020-05-20 02:39:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	/* Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = 
			DriverManager.getConnection(url, "scott", "1234"); */
	InitialContext ic = new InitialContext();
	DataSource ds =(DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
	Connection conn = ds.getConnection();
	String strSql = "SELECT * FROM DEPT ORDER BY DEPT_ID DESC";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	ResultSet rs = stmt.executeQuery();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>DEPT LIST</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<a href=\"insert.jsp\">추가</a>\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>부서번호</td><td>부서명</td><td>위치코드</td><td></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 
	while(rs.next()) 
	{
	
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getInt("DEPT_ID"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<a href=\"view.jsp?dept_id=");
      out.print(rs.getInt("DEPT_ID"));
      out.write("\">\r\n");
      out.write("\t\t\t");
      out.print(rs.getString("DEPT_NAME"));
      out.write("\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getInt("LOC_ID"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href=\"delete.jsp?dept_id=");
      out.print(rs.getInt("DEPT_ID"));
      out.write("\">삭제</a></td>\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");
 
	}
	rs.close();
	conn.close();
	
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
