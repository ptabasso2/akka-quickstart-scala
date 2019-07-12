package com.example;

public class TestClass {
    public void test(){
        System.out.println("In a Java class");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
