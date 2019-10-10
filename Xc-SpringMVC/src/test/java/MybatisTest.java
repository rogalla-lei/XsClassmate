


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import xsclassDemo.dao.IThesisDao;
import xsclassDemo.entity.Thesis;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IThesisDao thesisDao = session.getMapper(IThesisDao.class);
        List<Thesis> thesises = thesisDao.findAll();
        for (Thesis thesis : thesises){
            System.out.println(thesis.toString());
        }
        session.close();
        in.close();
    }
}
