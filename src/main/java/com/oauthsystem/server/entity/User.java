package com.oauthsystem.server.entity;

import lombok.Data;

import javax.persistence.Table;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Data
@Table(name = "user")
public class User {
    private String id;
    private String loginName;
    private String password;
    private String clientId;
    private String clientSecret;
    private List<Integer> ids=new ArrayList<>();
    public User add(Integer integer){
        this.ids.add(integer);
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public User(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    public static void main() {
        User user=new User();
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.forEach(user::add);
        System.out.println(Arrays.toString(user.getIds().toArray()));
    }

    public static void main(String[] args)  throws  Exception{
        String name="FBA (12/7/18 1:23 AM) - 1";
        name=name.substring(name.indexOf("(")+1,name.length());
        name=name.substring(0,name.indexOf(")"));
        name=name.substring(0,name.indexOf(" "));
        DateFormat a=new SimpleDateFormat("MM/dd/yy");
        a.parse(name);
        System.out.println(a.parse(name));
        DateFormat b=new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(b.format(a.parse(name)));
    }
}
