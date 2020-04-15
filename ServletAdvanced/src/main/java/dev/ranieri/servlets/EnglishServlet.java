package dev.ranieri.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EnglishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EnglishServlet() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Redirect tells the broweser to make another request to a differnt URL
		// It can be the same server or a differnt server
		// response.sendRedirect("http://localhost:8080/ServletAdvanced/hello.html");
		
		// forward uses the request dispatcher
		//request.getRequestDispatcher("SpanishServlet").forward(request, response);
		
		ServletContext sconxt = this.getServletContext();
		String cheer = sconxt.getInitParameter("cheer");
		
		response.getWriter().append("Hello World from the English Servlet" + cheer);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
