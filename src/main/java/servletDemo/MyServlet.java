package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


//public class MyServlet implements Servlet{
//
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public ServletConfig getServletConfig() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getServletInfo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void init(ServletConfig arg0) throws ServletException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
//public class MyServlet extends GenericServlet
//{
//	
//		
//	
//
//	@Override
//	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//	}
//}
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet
{
 	@Override
 	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
 	{
 		PrintWriter out =response.getWriter();
 		out.print("i an in doGet() method in browser");
 		System.out.println("I am in doGet() method");
 	}
 	
}
