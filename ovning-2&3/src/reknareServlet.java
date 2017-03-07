

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reknareServlet
 */
@WebServlet("/reknareServlet")
public class reknareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html"); 			
		
		  			int firstNum = Integer.parseInt(request.getParameter("numone"));
		 	        int secondNum = Integer.parseInt(request.getParameter("numtwo"));
		 	        int sum = firstNum + secondNum;
		 	         
		 	         
		 	        PrintWriter output = response.getWriter();
		 	         
		 	        output.println("<html><body><h3>" + sum +  "</body></html>");
		 	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
