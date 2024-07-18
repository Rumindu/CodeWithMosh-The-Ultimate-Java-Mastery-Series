package com.rumindu;

import java.util.Objects;

//Point.java
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        //if the obj is equal to the current instance of the class
        if(this == obj)
            return true;
        if(!(obj instanceof Point))
            return false;
        var other = (Point) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        //`Objects` class is imported from java.util package
        //multiple values can pass to hash() and -
        //-it returns hash value according to those
        return Objects.hash(x, y);
    }
}
