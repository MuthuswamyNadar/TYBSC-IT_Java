/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sammy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
@WebServlet(name="Calc",urlPatterns ="/Calculator")
public class Calculator extends HttpServlet
{
    
    public void processreq(HttpServletRequest req,HttpServletResponse res)throws 
            ServletException,IOException
    {
        PrintWriter out=res.getWriter();
        res.setContentType("text/html");
        //out.println("<html><head><title>Servlet CalculatorServlet</title></head><body>");
        double n1=Double.parseDouble(req.getParameter("txtN1"));
        double n2=Double.parseDouble(req.getParameter("txtN2"));
        
        double result=0;
        String opr=req.getParameter("opr");
        if(opr.equals("+"))result=n1+n2;
        if(opr.equals("-"))result=n1-n2;
        if(opr.equals("*"))result=n1*n2;
        if(opr.equals("/"))result=n1/n2;
        
        out.println("<h1>Result= "+  result);
        //out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processreq(req, resp);
    }
    
            
            
  
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processreq(req, resp);
    }
    
    
    
}
