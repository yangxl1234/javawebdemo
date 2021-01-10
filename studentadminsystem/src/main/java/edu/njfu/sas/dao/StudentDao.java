package edu.njfu.sas.dao;

import edu.njfu.sas.model.Student;
import edu.njfu.sas.util.PageUtil;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    String getAllStudent() throws SQLException;
    List<Student> getStudentsByName(String name);
    boolean saveStudent(Student s);
    public Student getStudentByNo(String stuno);
    public boolean updatestudent(Student s);
    public List<Student> getStudentByPaging(PageUtil pageUtil,int currentPage,int pageSize) throws SQLException;
    long totalRecords() throws SQLException;
}
