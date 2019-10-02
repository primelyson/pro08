package sec03.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sec03/ex01/first")
public class FirstServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws  ServletException, IOException { 
      response.setContentType("text/html;charset=utf-8");
      
      request.setAttribute("age", "30");
      
      System.out.println("First:"+request.getAttribute("age"));
      RequestDispatcher dispatch = request.getRequestDispatcher("second?name=lee");  
      dispatch.forward(request, response);
      //System.out.println("First:"+request.getParameter("age"));
   }
}

