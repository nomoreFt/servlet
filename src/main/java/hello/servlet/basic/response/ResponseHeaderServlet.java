package hello.servlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="responseHeaderServlet",urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //[status-line]
        resp.setStatus(HttpServletResponse.SC_OK);

        //[response-header]
        resp.setHeader("Content-Type","text/plain;charset=utf-8");
        resp.setHeader("Cache-Controler","no-cache, no-store, must-revalidate");
        resp.setHeader("Pragma","no-cache");
        resp.setHeader("my-header","hello");

        resp.getWriter().write("안녕하세요");

    }
}
