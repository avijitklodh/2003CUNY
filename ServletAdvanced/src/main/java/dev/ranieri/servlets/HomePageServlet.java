package dev.ranieri.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomePageServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// read that session attribute and send it to the front end
		String username = (String) request.getSession().getAttribute("username");
		response.getWriter().append(username + request.getSession().getId());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
