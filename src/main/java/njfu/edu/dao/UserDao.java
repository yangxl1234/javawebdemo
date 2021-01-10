package njfu.edu.dao;
import njfu.edu.model.User;
import njfu.edu.util.DBHelper;
import njfu.edu.util.Md5Util;

import java.util.ArrayList;
import java.util.List;

public class UserDao{
    public boolean checkLogin(User user){
        //sql statement
        String sql = "select * from tbl_user where username=? and password=?";
        //把占位符的值放到一个list中
        List<Object> params = new ArrayList<Object>();
        params.add(user.getUsername());
        //把明文转换为密文
        String encryptPassword= Md5Util.stringToMD5(user.getPassword());
        params.add(encryptPassword);
        //创建dbHelper对象
        DBHelper dbHelper=new DBHelper();
        List<Object> query=dbHelper.query(sql,params);
        return  query.size()>0;
    }
    public boolean saveUser(User u){
        String sql="insert into tbl_user(username,password) values(?,?)";
        //对占位符进行赋值，保存到List
        List<Object> params=new ArrayList<>();
        params.add(u.getUsername());
        params.add(Md5Util.stringToMD5(u.getPassword()));
        //创建DBHelper
        DBHelper db=new DBHelper();
        int result=db.update(sql,params);
        return result>0;
    }
}
