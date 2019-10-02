package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                                                                 throws ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      // �����: ��û�� ���� �������� url����
      // ������: context�������� url����
      request.setAttribute("name", "ȫ�浿");
      response.sendRedirect("second");
      System.out.println("Redirect �� ȣ��");
   }
}

