package com.itcast.path;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PathServlet
 */
public class PathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pt = PathServlet.class.getClassLoader().getResource("1.txt").getPath();
		System.out.println(pt);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static void main(String[] args) {
		String pt = PathServlet.class.getClassLoader().getResource("1.txt").getPath();
		System.out.println(pt );
	}
}
