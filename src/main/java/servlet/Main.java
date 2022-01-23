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

import model.Mutter;
import model.MutterLogic;
import model.User;

/**
 * Servlet implementation class Mutter
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		String text = request.getParameter("text");
		
		if(text!=null&&text.length()!=0) {
			HttpSession session = request.getSession();
			User loginUser = (User)session.getAttribute("loginUser");		
			Mutter mutter = new Mutter(loginUser.getName(), text);
			
			ServletContext application = request.getServletContext();
			List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");
			
			MutterLogic mutterLogic = new MutterLogic();
			
			mutterList = mutterLogic.execute(mutterList, mutter);
			
			application.setAttribute("mutterList", mutterList);	
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main2.jsp");//Welcomeでも？
		dispatcher.forward(request, response);
	}

}
