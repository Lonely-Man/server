package com.oauthsystem.server.util;

import com.oauthsystem.server.entity.User;
import org.hibernate.boot.jaxb.SourceType;

import javax.xml.transform.Source;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UUIDUtils {
    /**
     * 生成uuid
     * @return
     */
    public  static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 生成clientId
     * @return
     */
    public  static String createClientId(){
        return UUID.randomUUID().toString();

    }
    public static  void print(List<String> stringList){
        for(String s:stringList){
            System.out.print(s+"-");
        }
    }
    public static  void print2(List<String> stringList){
        for(int i=0;i<stringList.size();i++){
            System.out.print(stringList.get(i)+"-");
        }
    }

    public static void main(String[] args) {
        List<User> stringList=new ArrayList<>();
        stringList.add(new User("小明","1"));
        stringList.add(new User("小王","2"));
        stringList.add(new User("小李","3"));
        stringList.add(new User("小赵","4"));
        stringList.add(new User("小赵","5"));
        stringList.add(new User("小明","6"));
        stringList.add(new User("小王","7"));
        stringList.add(new User("小王","8"));
        stringList.add(new User("小王","9"));
        stringList.add(new User("小明","10"));
        List<User> collect = stringList.stream().filter(k -> !"小明".equals(k.getLoginName())).collect(Collectors.toList());
        Map<String, List<User>> collect1 = collect.stream().collect(Collectors.groupingBy(User::getLoginName));
        for(int i=0;i<collect1.get("小王").size();i++){
            System.out.println(collect1.get("小王").get(i).toString());
        }
        double sum = stringList.stream().mapToDouble(k -> Double.valueOf(k.getPassword())).sum();
        System.out.println(sum);
        //System.out.println(Arrays.toString(stringList.toArray()));
    }
}
