package com.rumindu;
//Main.java
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        System.out.println(point1.hashCode());//994
        System.out.println(point2.hashCode());//994
    }
}
