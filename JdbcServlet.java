//package com.Javaconnect;
//
//public class JdbcServlet {
//	package com.greycampus;
//
//	import java.sql.Connection;
//	import java.sql.DriverManager;
//	import java.sql.PreparedStatement;
//	import java.sql.SQLException;
//
//	public class Insertjdbc {
//		public void insert(Employeeinfo obj) {
//			Connection connection = null;
//			PreparedStatement prepareStatement = null;
//			try {
//				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe ", "c##bms1", "abc");
//				prepareStatement = connection.prepareStatement("Insert into Employee values(?,?,?)");
//				prepareStatement.setString(1, obj.getEno());
//				prepareStatement.setString(2, obj.getName());
//				prepareStatement.setString(3, obj.getSalary());
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
//package com.greycampus;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.sql.*;
//@WebServlet("/ServletforJdbc")
//public class ServletforJdbc extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.setContentType("text/html");
//		String eno = request.getParameter("eno");
//		String name = request.getParameter("name");
//		String salary = request.getParameter("salary");
//		Employeeinfo employeeinfo = new Employeeinfo();
//		employeeinfo.setEno(eno);
//		employeeinfo.setName(name);
//		employeeinfo.setSalary(salary);
//		Insertjdbc insertjdbc = new Insertjdbc();
//		insertjdbc.insert(employeeinfo);
//		PrintWriter writer = response.getWriter();
//		writer.print(eno + "<br>");
//		writer.print(name + "<br>");
//		writer.print(salary + "<br>");
//		writer.print("<a href=\"/Jdbctwoservlet/employeedetails.html\"> Add more Employee</a>");
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//}
