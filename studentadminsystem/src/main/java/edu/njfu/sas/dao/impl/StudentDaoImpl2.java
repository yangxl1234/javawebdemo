package edu.njfu.sas.dao.impl;

//import com.sun.tools.javac.tree.JCTree;
import edu.njfu.sas.dao.StudentDao;
import edu.njfu.sas.model.Student;
import edu.njfu.sas.util.C3p0Util;
import edu.njfu.sas.util.PageUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl2 implements StudentDao {
    QueryRunner queryRunner=null;
    @Override
    public String  getAllStudent() throws SQLException {
        String sql="select * from tbl_student ";
        QueryRunner queryRunner=new QueryRunner(C3p0Util.getConnection());
        List<Student> students=queryRunner.query(sql,new BeanListHandler<Student>(Student.class));
        return students.toString();
    }

    @Override
    public List<Student> getStudentsByName(String name) {
        return null;
    }

    @Override
    public boolean saveStudent(Student s) {
        return false;
    }

    @Override
    public Student getStudentByNo(String stuno) {
        return null;
    }

    @Override
    public boolean updatestudent(Student s) {
        return false;
    }

    @Override
    public List<Student> getStudentByPaging(PageUtil pageUtil, int currentPage, int pageSize) {
        String sql="select * from tbl_student where stuno limit ?,?";
        int start=(currentPage-1)*pageSize;
        QueryRunner queryRunner = new QueryRunner(C3p0Util.getConnection());
        try{
            List<Student> students=queryRunner.query(sql,new BeanListHandler<Student>(Student.class),new Object[]{start,pageSize});
            return students;
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public long totalRecords()  {
        String sql="select count(*) as count from tbl_student";
        //long result=0;
        queryRunner = new QueryRunner(C3p0Util.getConnection());
        try{
            List<Map<String,Object>> query=queryRunner.query(sql,new MapListHandler());
            return (Long)query.get(0).get("count");
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return -1;
    }
}
