
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
@WebServlet(name="swamyz",urlPatterns="/LogoutServlet")
public class LogoutServlet extends HttpServlet{
    
     public void logz(HttpServletRequest req,HttpServletResponse resp) 
            throws ServletException,IOException
    {
    resp.setContentType("text/html;charset=UTF-8");
    PrintWriter out = resp.getWriter();
    out.println("<html><head><title>Servlet LogoutServlet</title></head>");
    out.println("<body>");
    jakarta.servlet.http.HttpSession hs = req.getSession();
    if(hs != null) hs.invalidate();
    out.println("<h1>You are Logged out now........</h1>");
    out.println("</body>");
    out.println("</html>");
    
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logz(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logz(req, resp);
    }
     
} 

