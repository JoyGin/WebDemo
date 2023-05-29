package com.joygin.pojo;

public class User {
    private int id;
    private String username;
    private String password;
    private String gender;
    private String addr;

    //省略了 setter 和 getter

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
