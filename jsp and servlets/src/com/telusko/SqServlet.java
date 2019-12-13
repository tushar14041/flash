package com.telusko;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
//@WebServlet("/sq")  //anotation instead of web.xml file declaration
public class SqServlet extends HttpServlet
{
  	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
	
//   		int k = (int)req.getAttribute("k");
//  		HttpSession session = req.getSession();
//  		int k = (int)session.getAttribute("k");
//  		
//  		int k= (int)req.getAttribute("k");
  		System.out.println("ssq calledx");

  		int k= Integer.parseInt(req.getParameter("k"));
 k=k*k;
  		
  		System.out.println("ssq called2");

  		PrintWriter out = res.getWriter();
  		out.println("hello to sq : "+ k);
  		System.out.println("ssq called3 ");
  		
   		
	}				

}
/*
int k = 0;
	Cookie cookies[] = req.getCookies();
	
	for(Cookie c : cookies)
	{
		if(c.getName().equals("k"))
		 k= Integer.parseInt(c.getValue());
	}
	
	 
	k=k*k;
	
	PrintWriter out = res.getWriter();
	out.println("Result is : " + k);

	System.out.println("sq called");
	*/