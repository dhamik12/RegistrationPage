package com.soumik.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Registration() {
        
    	System.out.println("Servlet Instantiated..");   
    	
    }

	
	public void init(ServletConfig config) throws ServletException {
	
		System.out.println("Servlet Initialized...");
	}
	
	public void destroy() {
		
		System.out.println("Servlet Deinstantiated...");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("username");
		String address=request.getParameter("useraddr");
		String phnumber=request.getParameter("usernumber");
		System.out.println(name +":"+address+ ":"+ phnumber);
		
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><title>result</title></head>");
		pw.println("<body bgcolor:cyan>");
		pw.println("<h1>Form Input-</h1>");
		pw.println("<table border= 2px><tr><th>Name</th><th>Address</th><th>Phone Number</th></tr>");
		pw.println("<tr><td>"+name+"</td><td>"+address+"</td><td>"+phnumber+"</td></tr>");
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

}
