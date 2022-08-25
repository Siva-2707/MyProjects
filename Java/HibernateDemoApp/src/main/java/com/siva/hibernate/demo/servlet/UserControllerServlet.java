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
@WebServlet("/UserControllerServlet")
public class UserControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserControllerServlet() {
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
		String val = request.getParameter("operation") ;
		if(val.equals("insert")) {
			User user = new User();
			user.setName((String)request.getParameter("name"));
			user.setAge(Integer.parseInt(request.getParameter("age")));
			user.setUserId(Integer.parseInt(request.getParameter("userId")));
			UserController controller = new UserController();
			controller.insertUser(user);
			
		}
		request.getRequestDispatcher("jsp/index.jsp").include(request, response);;
	}

}
