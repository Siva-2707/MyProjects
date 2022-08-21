package com.siva.hibernate.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siva.hibernate.demo.beans.User;
import com.siva.hibernate.demo.controller.UserController;




/**
 * Servlet implementation class UserContollerServlet
 */
@WebServlet("/UserContollerServlet")
public class UserContollerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserContollerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getAttribute("submit") == "insert") {
			User user = new User();
			user.setName((String)request.getAttribute("name"));
			user.setAge((Integer)request.getAttribute("age"));
			UserController controller = new UserController();
			controller.insertUser(user);
			
		}
		request.getRequestDispatcher("jsp/index.jsp").include(request, response);;
	}

}
