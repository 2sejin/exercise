package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/background")
public class BackgroundServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("do Get...");
		
		//request 데이터 가공 -> request 반영
		//request.getParameter(""); 사용자로부터 받은 data
		
		//request.setAttribute("key", "value"); 가공된 data
		
		request.getRequestDispatcher("/WEB-INF/views/background.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Post...");
	}
}
