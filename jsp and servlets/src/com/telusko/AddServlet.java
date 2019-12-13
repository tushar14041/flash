package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
 //@WebServlet("/add")

public class AddServlet extends HttpServlet
{ 
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		  
 		int k = i + j;
 		res.sendRedirect("sq?k="+k);
 		
 /*	    k= k*k;
 		req.setAttribute("k",k);
 		
 		RequestDispatcher rd = req.getRequestDispatcher("sq");
 	    rd.forward(req, res);
*/
	}
	
}
		/*   PrintWriter out = res.getWriter();
       out.println("<html><body bgcolor='cyan'>" );
       out.println("Output : " + k);
       out.println("</body></html>");
*/
//		Cookie cookie = new Cookie("k", k + "");
//		res.addCookie(cookie);
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		//res.sendRedirect("sq");   //URL Rewriting
		
	//	 req.setAttribute("k", k);
		
//          PrintWriter out = res.getWriter();
//      out.println("result is = "+k);
// 
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
// 	
//		