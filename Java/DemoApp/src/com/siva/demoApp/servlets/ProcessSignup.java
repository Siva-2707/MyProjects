package com.siva.demoApp.servlets;
import com.siva.demoApp.dao.UserDao;
import com.siva.demoApp.model.User;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessSignup
 */
@WebServlet("/processSignup")
public class ProcessSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessSignup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		
		UserDao dao = new UserDao();
		User user = new User();
		if(dao.setUser(username, password)) {
			user = dao.getUser(username);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("welcome.jsp");
		}
		else {
			PrintWriter out = response.getWriter();
			out.print("Username Already present.");
			out.close();
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);

		}
		
		
	}

}
