package model;

public class User {
    private int id;
    private String userName;
    private String password;
    private int type;
    private String stuno;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public User(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getType() {
        return type;
    }

    public String getStuno() {
        return stuno;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", stuno='" + stuno + '\'' +
                '}';
    }
}
