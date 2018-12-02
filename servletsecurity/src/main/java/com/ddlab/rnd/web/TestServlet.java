package com.ddlab.rnd.web;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class TestServlet extends HttpServlet {
protected void processRequest(HttpServletRequest request, 
                              HttpServletResponse response)
               throws ServletException, IOException {
   PrintWriter out = response.getWriter();
   out.println("Hello from " + getServletName());
}
 
@Override
protected void doGet(HttpServletRequest request, 
                     HttpServletResponse response)
               throws ServletException, IOException {
   processRequest(request, response);
}
 
@Override
protected void doPost(HttpServletRequest request, 
                      HttpServletResponse response)
               throws ServletException, IOException {
   processRequest(request, response);
}
}