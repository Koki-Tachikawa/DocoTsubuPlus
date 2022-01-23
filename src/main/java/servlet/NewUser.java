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

import model.ID;
import model.User;
import model.UserLogic;

/**
 * Servlet implementation class NewUser
 */
@WebServlet("/NewUser")
public class NewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/newUser.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		ServletContext application = this.getServletContext();
		
		String name = request.getParameter("newUserName");
		String pass = request.getParameter("newUserPass");
		
		if(name!=null&&name.length()!=0&&pass!=null&&pass.length()!=0) {
			ID id = (ID)application.getAttribute("id");
			if(id==null) {
				id = new ID();
				application.setAttribute("id", id);
			}
	
			int IDNum = id.getID();
			
			User newUser = new User(name, pass, IDNum);
	
			List<User> userList = (List<User>)application.getAttribute("userList");
			
			/*
			 boolean isNewUser = userList.checkNewUser(newUser);
			 request.setAttribute("isNewUser", isNewUser);
			 if(isNewUser == true){
			 */
			
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", newUser);
			
			UserLogic userLogic = new UserLogic();
			userLogic.execute(userList, newUser);
			application.setAttribute("userList", userList);
			request.setAttribute("newUser", newUser);
			 /*	
			 }		 
			 */
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/newUserResult.jsp");
		dispatcher.forward(request, response);
	}

}
