import javax.servlet.*;
import java.io.*; 
import javax.servlet.http.*;

public class Server extends HttpServlet {

 

public Server(){

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
        PrintWriter print = response.getWriter();
        print.println("Welcome");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    
}