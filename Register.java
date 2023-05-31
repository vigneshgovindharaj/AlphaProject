 	package vignesh;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		String id = request.getParameter("id");
		String fname = request.getParameter("fname");
		String birthday = request.getParameter("birthday");
		String gender = request.getParameter("gender");
		String pname = request.getParameter("pname");
		String father = request.getParameter("father");
		String mother = request.getParameter("mother");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String college = request.getParameter("college");
		String qulification = request.getParameter("qulification");
		String lag = request.getParameter("lag");
		
		Member details = new Member(id, fname, birthday, gender, pname, father, mother, address, email, college, qulification, lag);
		
		RegisterDao rDao = new RegisterDao();
		Connection result = rDao.insert(details);
		response.getWriter().print(result); 
		}

}
