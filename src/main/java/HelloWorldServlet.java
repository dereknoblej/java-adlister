import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

            PrintWriter out = res.getWriter();
            String ByName = req.getParameter("name");
            if(ByName == null){
                out.println("Hello, World!");
            } else {
                out.println("Hello, " + ByName);
            }

    }

}

