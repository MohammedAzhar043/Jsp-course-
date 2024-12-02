

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/name")
public class DemoServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
//		String name = "Azhar";
//		req.setAttribute("lable", name);
//		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
//		rd.forward(req, res);
//		
//		Student student = new Student(24,"Mohammed Azhar");
//		req.setAttribute("student", student);
//		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
//		rd.forward(req, res);
		
		List<Student> students = Arrays.asList( new Student(24,"Mohammed Azhar"), new Student(24,"Mohammed Azhar"), 
				new Student(24,"Mohammed masood"),
				new Student(24,"Mohammed anas"),
  				new Student(24,"Mohammed junaid"));
		req.setAttribute("students", students);
		RequestDispatcher rd = req.getRequestDispatcher("abc.jsp");
		rd.forward(req, res);
		
	}

}
