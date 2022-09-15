import javax.servlet.*;
import java.io.*; 
import javax.servlet.http.*;

public class Controller extends HttpServlet {

    public void init(ServletConfig servlet) throws ServletException {
    }

    public ServletConfig getServeletConfig() {
        return null;
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        String name = request.getParameter("name");
        PrintWriter print = response.getWriter();
        print.println("Welcome" + name);
    }

    public String getServletInfo() {
        return null;
    }
    
    public void destory() {
    }
    
}