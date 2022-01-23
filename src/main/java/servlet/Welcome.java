package servlet;

import java.io.IOException;
import java.util.ArrayList;
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
import model.Mutter;
import model.User;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    /*
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	これなくしたらエラーなし
	*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ServletContext application = this.getServletContext();
		ID id = (ID)application.getAttribute("id");
		List<User> userList = (List<User>)application.getAttribute("userList");
		List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");
		User adminUser = (User)application.getAttribute("adminUser");
		
		if(id==null) {
			id = new ID();
			application.setAttribute("id", id);
		}
		if(userList==null) {
			userList = new ArrayList<User>();
			User user = new User("testUser", "0000", 0);
			userList.add(user);
			/*
			UserLogic userLogic = new UserLogic();
			userLogic.execute(userList, user);
			 */
			application.setAttribute("userList", userList);
		}
		if(mutterList==null) {
			mutterList = new ArrayList<Mutter>();
			application.setAttribute("mutterList", mutterList);
		}
		if(adminUser==null) {
			adminUser = new User("adminUser", "1111");
			application.setAttribute("adminUser", adminUser);
		}
		//↑思いつかなかった
		
		
		HttpSession session = request.getSession();
		User loginUser = (User)session.getAttribute("loginUser");
		
		if(loginUser==null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main2.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
