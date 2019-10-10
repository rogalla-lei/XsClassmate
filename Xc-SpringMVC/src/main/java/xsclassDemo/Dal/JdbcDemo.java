package xsclassDemo.Dal;

import xsclassDemo.dao.Thesis;

public interface JdbcDemo {
    public Thesis findArticle(Thesis thesis) throws Exception;
}
