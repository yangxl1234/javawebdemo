package dao;
import model.Student;
import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    String getAllStudent() throws SQLException;
    List<Student> getStudentsByName(String name);
    boolean saveStudent(Student s);
    public Student getStudentByNo(String stuno);
    boolean updateStudent(Student s);
    List<Student> getStudentByPaging(int currentPage, int PageSize);
    long totalRecords();
}


