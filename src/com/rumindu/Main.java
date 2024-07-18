package com.rumindu;
//Main.java
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        //passing object of TextBox class instead of Point class's object
        System.out.println(point1.equals(point1));// false
    }
}
