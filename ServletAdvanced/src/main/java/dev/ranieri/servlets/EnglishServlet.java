package dev.ranieri.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
		
//		ServletContext sconxt = this.getServletContext();
//		String cheer = sconxt.getInitParameter("cheer");
		
		//response.getWriter().append("Hello World from the English Servlet" + cheer);
		
		// maintaining the session.
		// Why? Makes our user experience
		// You can maintatin the session 
		// 1. Client side (cookies, url rewriting, html hidden forms)
		// 2. Server side (httpSession object)
		
		// Cookies are small text files saved unto a person's browser
		// do not store sensitive information in a cookie (security reasons)
		// people can try to steal your cookies
//		Cookie cookie = new Cookie("name","Adam_Ranieri");
//		response.addCookie(cookie);
//		response.getWriter().append("Added a cookie to your browser");
		
		// HTTP session object will store information on the server
		HttpSession sess = request.getSession();
		sess.setAttribute("name", "Adam Ranieri");
		
		// Your sessions exists in the servlet container
		// Sessions are accesible in other servlets as well
		response.getWriter().append((CharSequence) sess.getAttribute("name"));
		sess.invalidate();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
