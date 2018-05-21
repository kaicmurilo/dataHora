package com.kaicolas.ex1;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/horaData")
public class horaData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calendar calendario = Calendar.getInstance();		
		
		response.getWriter().println("<html>");
		response.getWriter().println("<body>");
		response.getWriter().println("<h1>Exercicio 1 Hora e Data</h1>");
		response.getWriter().println(new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime()));
		response.getWriter().println(new SimpleDateFormat("hh:mm:ss").format(calendario.getTime()));
		response.getWriter().println("<body>");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");	
	}

}
