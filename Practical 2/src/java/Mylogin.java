
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="swamy",urlPatterns = "/Mylogin")

public class Mylogin extends HttpServlet 
{
    public void process(HttpServletRequest req,HttpServletResponse res) 
            throws ServletException,IOException
    {
            res.setContentType("text/html;charset=UTF-8");
            PrintWriter out =res.getWriter();
            String uname=req.getParameter("txtid");
            String upass=req.getParameter("txtpass");
            
            if(uname.equals("admin")&& upass.equals("123"))
            {
                out.println("<h1>Welcome "+uname+"</h1>");
                out.println("<body bgcolor=pink>");
            }
            else
            {
                out.println("<body bgcolor=firebrick>");
                //out.println("<h1 style=color:white;>");
                out.println("<h1 style=color:green>Login Failed");
            }
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
