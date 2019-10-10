package xsclassDemo.Dal.imp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xsclassDemo.Dal.JdbcDemo;
import xsclassDemo.dao.Connect;
import xsclassDemo.dao.Thesis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemoImp implements JdbcDemo {


    @Override
    public Thesis findArticle(Thesis thesis) throws Exception {
//        创建spring容器对象
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("bean.xml");
        Connect cnet = cp.getBean("connect",Connect.class);
//        jdbc
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn = DriverManager.getConnection(cnet.getUrl(),cnet.getUsername(),cnet.getPassword());
        PreparedStatement sql = conn.prepareStatement("select * from thesis where thesisid = 1");
        ResultSet rs = sql.executeQuery();
        while (rs.next()){
        thesis.setThesisID(rs.getInt("thesisid"));
        thesis.setEditorID(rs.getInt("editorid"));
        thesis.setTitle(rs.getString("title"));
        thesis.setContent(rs.getString("content"));
        thesis.setDate(rs.getDate("thesisdate"));
        thesis.setLikeAccount(rs.getInt("likeAccount"));
        thesis.setViewAccount(rs.getInt("viewAccount"));
        }
        rs.close();
        sql.close();
        conn.close();
        return thesis;
    }
}
