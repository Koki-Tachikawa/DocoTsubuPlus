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
 * Servlet implementation class AdminChange
 */
@WebServlet("/AdminChange")
public class AdminChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminChange() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/adminChange.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		ServletContext application = this.getServletContext();
		
		String newAdminName = request.getParameter("newAdminName");
		String newAdminPass = request.getParameter("newAdminPass");
		
		boolean isChangeAdmin = false;
		
		if(newAdminName!=null&&newAdminName.length()!=0&&newAdminPass!=null&&newAdminPass.length()!=0) {
			User newAdminUser = new User(newAdminName, newAdminPass);
			
			application.setAttribute("adminUser", newAdminUser);
			
			isChangeAdmin = true;
		}
		request.setAttribute("isChangeAdmin", isChangeAdmin);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/adminChangeResult.jsp");
		dispatcher.forward(request, response);
	}

}
