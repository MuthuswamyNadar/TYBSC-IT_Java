
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="swamy",urlPatterns = "/ColorServlet")

public class ColorServlet extends HttpServlet {
    
    public void mycolor(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
    {
        resp.setContentType("Text/Html");
        String c=req.getParameter("color");
        PrintWriter pw=resp.getWriter();
        if(c.equals("red"))
        {
        pw.println("<body bgcolor=red>");
        }   
        if(c.equals("green"))
        {
            pw.println("<body BGCOLOR=green>");
        }
        if(c.equals("green"))
        {
        pw.println("<body BGCOLOR=green>");
        }
        if(c.equals("blue"))
        {
        pw.println("<body BGCOLOR=blue>");
        }
        if(c.equals("yellow"))
        {
        pw.println("<body BGCOLOR=yellow>");
        }
        if(c.equals("black"))
        {
        pw.println("<body BGCOLOR=black>");
        pw.println("<center><h2>The selected color is:"+c+"</h2></center>");;
        pw.close();
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mycolor(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mycolor(req, resp);
    }
    
    
}
