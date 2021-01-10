package dao.Impl;


import dao.UserDao;
import model.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import util.C3p0Util;
import util.Md5Util;

import java.sql.SQLException;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean checkLogin(User user) throws SQLException {
        String sql = "select count(*) as count from tbl_user where username=? and password=?";
        long count=0;
        QueryRunner query = new QueryRunner(C3p0Util.getConnection());
        Map<String, Object> map = query.query(sql, new MapHandler(), new Object[]{user.getUserName(), Md5Util.stringToMD5(user.getPassword())});
        count=(Long)map.get("count");
        return count>0;
    }

    @Override
    public boolean saveUser(User user) throws SQLException {
        String sql="insert into tbl_user(username,password) values(?,?)";
        int result=0;
        QueryRunner query = new QueryRunner(C3p0Util.getConnection());
        result = query.execute(sql, new Object[]{user.getUserName(), Md5Util.stringToMD5(user.getPassword())});
        return result>0;
    }

    @Override
    public boolean updateStuno(String no) {
        return false;
    }
}
