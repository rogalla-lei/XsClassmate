package xsclassDemo.service.imp;

import com.alibaba.fastjson.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xsclassDemo.Dal.imp.JdbcDemoImp;
import xsclassDemo.dao.Thesis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class XsclassmateServletImp extends HttpServlet  {
    ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("bean.xml");
    JdbcDemoImp jdd = cp.getBean("jdbcDemoImp",JdbcDemoImp.class);
    Thesis tes = cp.getBean("thesis",Thesis.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try  {
            resp.setContentType("application/json;charset=utf-8");
            resp.setHeader("Access-Control-Allow-Origin", "*");
            resp.setHeader("Access-Control-Allow-Methods", "GET,POST");

            PrintWriter out = resp.getWriter();
            Thesis tes1 = jdd.findArticle(tes);
//          System.out.println(tes1.getThesisID());
            String jsr = JSON.toJSONString(tes1);
            out.write(jsr);
        }
        catch (Exception ee){
            ee.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
