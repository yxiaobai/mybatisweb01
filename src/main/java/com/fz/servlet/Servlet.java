package com.fz.servlet;

import com.fz.model.Student;
import com.fz.mybatis.Mybatis;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 易小白 on 2017/1/10.
 */
@WebServlet("/show.do")
public class Servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SqlSession s = Mybatis.getSqlSession();
        //List<Student> st = s.getMapper(StudentMapper.class).query();
        List<Student> st=s.selectList("query");



        req.setAttribute("st", st);
        req.getRequestDispatcher("show.jsp").forward(req,resp);

    }
}
