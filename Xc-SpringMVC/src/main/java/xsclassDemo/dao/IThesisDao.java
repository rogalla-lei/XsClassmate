package xsclassDemo.dao;

import org.apache.ibatis.annotations.Select;
import xsclassDemo.entity.Thesis;

import java.util.List;

public interface IThesisDao {
    @Select("select * from thesis")
    List<Thesis> findAll();
}
