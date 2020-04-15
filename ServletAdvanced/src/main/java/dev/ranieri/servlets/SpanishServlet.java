package dev.ranieri.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SpanishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SpanishServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Servlet context and servlet config
		// You can store parameters in the web.xml file
		// Servlet config are parameters for a single servlet
		
		ServletConfig sconf = this.getServletConfig();
		String greeting = sconf.getInitParameter("Greeting");
		
		// Servlet context are parameters the servlet container (all servlets)
		
		
		
		response.getWriter().append(greeting+" from the Spanish Servlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
