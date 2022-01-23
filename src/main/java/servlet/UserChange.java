package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class UserChange
 */
@WebServlet("/UserChange")
public class UserChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserChange() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/userChange.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
			
		String newLoginName = request.getParameter("newLoginName");
		String newLoginPass = request.getParameter("newLoginPass");
		boolean isChangeUser = false;
		
		if(newLoginName!=null&&newLoginName.length()!=0&&newLoginPass!=null&&newLoginPass.length()!=0) {
			User newLoginUser = new User(newLoginName, newLoginPass);

			HttpSession session = request.getSession();
			session.setAttribute("loginUser", newLoginUser);
			isChangeUser = true;
		}
		request.setAttribute("isChangeUser", isChangeUser);
			
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/userChangeResult.jsp");
		dispatcher.forward(request, response);
	}

}
