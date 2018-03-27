package com.ysr.demo4;

/**
 * Created by Administrator on 2018/3/27.
 */
public class Person {
    private String name;

   /* public Person(String name){
        this.name = name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

