package webjstl.test.servlet;

import webjstl.test.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(urlPatterns = "")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = new ArrayList<>();
        users.add(new User("Evgeniy",22,"male","Belarus"));
        users.add(new User("Ann",20,"female","USA"));
        users.add(new User("Nik",23,"male","Ukraine"));
        users.add(new User("Serg",37,"male","China"));
        req.setAttribute("users",users);

        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        int yearNow = Integer.parseInt(year.format(new Date()));
        req.setAttribute("yearNow",yearNow);

        getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
