package njfu.edu.TEST;

import njfu.edu.dao.UserDao;
import njfu.edu.model.User;

public class Test {
    public static void main(String[] args){
        new UserDao().saveUser(new User("王五","123456"));
    }
}
