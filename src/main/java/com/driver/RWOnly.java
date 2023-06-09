package com.driver;

public class RWOnly {
    private String name;
    void setter(String name){
        this.name=name;
    }
    void getter(){
        System.out.println(this.name);
    }
}
