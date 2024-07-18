//Point.java
package com.rumindu;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // generated from intelliJ
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    //    @Override
//    public boolean equals(Object obj) {
//        //if the obj is equal to the current instance of the class
//        if(this == obj)
//            return true;
//        if(!(obj instanceof Point))
//            return false;
//        var other = (Point) obj;
//        return x == other.x && y == other.y;
//    }
//
//    @Override
//    public int hashCode() {
//        //`Objects` class is imported from java.util package
//        //multiple values can pass to hash() and -
//        //-it returns hash value according to those
//        return Objects.hash(x, y);
//    }
}
