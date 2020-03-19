package dm;


import daminpl.dlDaoinpl;
import dom.dlDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class deserve extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("登陆成功");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        dlDao w=new dlDaoinpl();
        int id=w.dl(name,pwd);
        if (id>0){
            out.print("<script type='text/javascript'>alert('登陆成功');location.href='index.jsp';</script>");
        }else{
            out.print("<script type='text/javascript'>alert('账号或者密码错误');location.href='index.jsp';</script>");

        }

    }
}
