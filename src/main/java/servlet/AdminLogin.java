package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
/**
 * Servlet implementation class Admin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/adminLogin.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		ServletContext application = this.getServletContext();
		User adminUser = (User)application.getAttribute("adminUser");
		
		String adminName = request.getParameter("adminName");
		String adminPass = request.getParameter("adminPass");
		
		boolean isAdminUser = false;
		
		if(adminUser.getName().equals(adminName)||adminUser.getPass().equals(adminPass)) {
			isAdminUser = true;
		}
		
		request.setAttribute("isAdminUser", isAdminUser);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/adminLoginResult.jsp");
		dispatcher.forward(request, response);
	}

}
