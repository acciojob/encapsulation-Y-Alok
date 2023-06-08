package com.driver;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[]args) {
        RWOnly obj = new RWOnly();

//        obj.name = "ALOK";
//        System.out.println(obj.name);
//        java: name has private access in com.driver.RWOnly

        obj.setName("ALOK");
        System.out.println(obj.getName());
    }


}