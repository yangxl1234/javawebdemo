package dao;



import model.User;

import java.sql.SQLException;

public interface UserDao {
    public boolean checkLogin(User user) throws SQLException;
    boolean saveUser(User user) throws SQLException;
    boolean updateStuno(String no);
}
