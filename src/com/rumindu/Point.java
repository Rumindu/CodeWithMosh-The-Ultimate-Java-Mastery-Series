package com.rumindu;
//Point.java
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //couldn't change parameter type Object in to Point
    //(Point obj) is ❌
    //because it will change the method signature
    @Override
    public boolean equals(Object obj) {
        //downcast Object to Point
        var Other = (Point) obj;
        return x == Other.x && y == Other.y;
    }
}
