package servletDemo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
@Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException,IOException{
	System.out.println("I am in login service method....");
}
}
