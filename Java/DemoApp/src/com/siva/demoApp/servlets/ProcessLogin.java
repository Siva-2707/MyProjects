package com.siva.demoApp.servlets;

import java.io.IOException;

//import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.siva.demoApp.dao.UserDao;
import com.siva.demoApp.model.User;
/**
 * Servlet implementation class ProcessLogin
 */
@WebServlet("/ProcessLogin")
public class ProcessLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		UserDao ud = new UserDao();
		
		if(ud.checkLogin(username, pass)) {
			HttpSession session = request.getSession();
			User user = ud.getUser(username);
			session.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.include(request, response);
			
			response.sendRedirect("welcome.jsp"); // New response and Request objects are created. So anything transfered must be in HttpSession
		}
		else
		{
			
			response.sendRedirect("login.jsp");
			
		}
	}
	


}
