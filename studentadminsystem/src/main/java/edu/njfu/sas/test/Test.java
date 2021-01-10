package edu.njfu.sas.test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.njfu.sas.dao.UserDao;
import edu.njfu.sas.dao.impl.StudentDaoImpl;
import edu.njfu.sas.dao.impl.StudentDaoImpl2;
import edu.njfu.sas.dao.impl.UserDaoImpl;
import edu.njfu.sas.model.Student;
import edu.njfu.sas.model.User;
import edu.njfu.sas.util.DbcpUtil;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, SQLException {
//        //System.out.println(new StudentDaoImpl().getStudentsByName("张三"));
//        System.out.println(new StudentDaoImpl().getStudentByNo("180804217"));
//        Student s=new Student("161103213","22222","212","男","122","21213","213","12123");
//        System.out.println(new StudentDaoImpl().updatestudent(s));
        //System.out.println(new StudentDaoImpl().getStudentByPaging(2,4));
        //System.out.println(new StudentDaoImpl().totalRecords());
//        Properties properties=new Properties();
//        InputStream in =new Test().getClass().getClassLoader().getResourceAsStream("dbcpconfig.properties");
//        properties.load(in);
//        System.out.println(properties.getProperty("password"));
//        System.out.println(properties.getProperty("url"));
//        properties.setProperty("username2","sdadsadads");
//        System.out.println(properties.getProperty("username2"));
//        System.out.println(DbcpUtil.getDataSource()==null);
//        System.out.println(DbcpUtil.getDataSource().getConnection()==null);
        //System.out.println(new StudentDaoImpl2().getAllStudent());
        // System.out.println(new StudentDaoImpl2().totalRecords());
//        UserDao dao=new UserDaoImpl();
//        User u=new User("zhangsan","123456");
//        System.out.println(dao.checkLogin(u));
//        List list=new ArrayList<>();
//        list.add(1);
//        list.add("hello");
//        list.add(true);
//        list.add('A');
//        for(Object o:list){
//            System.out.println(o);
//        }
//        List<String> list1=new ArrayList<String>();
//        List<Student> list2=new ArrayList<>();
//        System.out.println(list1.getClass());
//        System.out.println(list2.getClass());
//        StudentDaoImpl sdao= new StudentDaoImpl();
//        String students=sdao.getAllStudent();
//        String json=new Gson().toJson(students);
//        Gson gson=new Gson();
//        Type type=new TypeToken<List<Student>>(){
//
//        }.getType();
//        List<Student> stus=(List<Student>)gson.fromJson(json,type);
//        for(Student s:stus){
//            System.out.println(s);
//        }
//    }
        System.out.println(new StudentDaoImpl().deleteStu("李四"));
    }
}
