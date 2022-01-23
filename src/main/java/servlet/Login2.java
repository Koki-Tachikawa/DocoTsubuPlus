package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class Login2
 */
@WebServlet("/Login2")
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		ServletContext application = this.getServletContext();
		List<User> userList = (List<User>)application.getAttribute("userList");

		String loginUserName = request.getParameter("loginUserName");
		String loginUserPass = request.getParameter("loginUserPass");
		
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).getName().equals(loginUserName)||userList.get(i).getPass().equals(loginUserPass)) {
				int ID = userList.get(i).getID();
				User loginUser = new User(loginUserName, loginUserPass, ID);
				
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", loginUser);
			}else {
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/loginResult.jsp");
		dispatcher.forward(request, response);
	}

}
