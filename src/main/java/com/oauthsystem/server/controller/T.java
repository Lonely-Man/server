package com.oauthsystem.server.controller;

import com.oauthsystem.server.entity.User;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

public class T {
    private static ReentrantReadWriteLock reentrantLock=new ReentrantReadWriteLock();
    public static int[] twoSum(int[] nums, int target) {
        reentrantLock.readLock().lock();
        String result="";
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(isTrue(nums[i],nums[j],target)){
                    result+=i+","+j+",";
                    continue;
                }
            }

        }
        int[] array = Arrays.asList(result.split(",")).stream().mapToInt(Integer::parseInt).toArray();
        return array;


    }


    public static void main(String[] args) {
       boolean f= Long.valueOf("-1")<0;
        System.out.println(f);
        List<User> users=new ArrayList<>();
        for (int i=0;i<50;i++){
            users.add(new User("name"+i,"DD"+i));
        }
        Map<String, User> collect = users.stream().collect(Collectors.toMap(k -> k.getLoginName() + "-" + k.getPassword(), k -> k));
        System.out.println(collect.get("name1-DD1").getLoginName());
    }
    public static boolean isTrue(int a,int b,int c){
        if((a+b)==c){
            return true;
        }
        return false;
    }
}
