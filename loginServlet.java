package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.jdt.internal.compiler.lookup.TypeSystem;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String str1 = request.getParameter("username");
		String str2 = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.println("The User Details Are: ");
		out.println("The Username is :" + " " + str1);
		out.println("The Password is :" + " " + str2);
		
		if(str1.equals("Durga") && str2.equals("Durga@1234"))
		{
			System.out.println("Login Success");
		}
		else
		{
		    System.out.println("Login failed try again.............");	
		}
				
		
	}

}
