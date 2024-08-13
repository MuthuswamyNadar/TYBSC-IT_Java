
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="swamy",urlPatterns="/Visitservlet")
public class Visitservlet extends HttpServlet
{
    public void process(HttpServletRequest req,HttpServletResponse resp) 
            throws ServletException,IOException
    {
        resp.setContentType("text/html");
        PrintWriter out =resp.getWriter();
        out.println("<html><head><title>Servlet Page1</title></head>");
        HttpSession hs=req.getSession(true);
        
        if(hs.isNew())
        {
            out.println("<body bgcolor=yellow>");
            String name=req.getParameter("txtname");
            hs.setAttribute("uname",name);
            hs.setAttribute("visit", "1");
            out.println("Welcome first time");
        }
        else{
             int visit = Integer.parseInt((String)hs.getAttribute("visit"))+1;
             out.println("<h1>You Visited "+visit+"Times</h1>");
             hs.setAttribute("visit", ""+visit);
            
        }
        out.println("<h3>Your Session ID "+hs.getId()+"</h3>");
        out.println("<h3>You Logged in at "+new java.util.Date(hs.getCreationTime())+"</h3>");
        out.println("<h1><a href=LogoutServlet>Click to logout Session </a></h1>");
        out.println("</body>");
        out.println("</html>");
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }
    
}
