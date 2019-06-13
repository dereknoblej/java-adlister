import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    String pass = request.getParameter("password");
    if (name == null || pass== null){
        name = "World";
    } else if (name.equals("admin") && pass.equals("password")){
        response.sendRedirect("/profile.jsp");
        return;
    }
    request.setAttribute("name", name);
    request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
}
