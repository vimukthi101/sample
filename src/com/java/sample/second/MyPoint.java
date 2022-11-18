package com.java.sample.second;

public class MyPoint {
    private static int x = 0;
    private static int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        MyPoint.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        MyPoint.y = y;
    }

    public static void setY(int x, int y) {
        MyPoint.x = x;
        MyPoint.y = y;
    }

    @Override
    public String toString() {
        return "";
    }

    public double distance(int x, int y) {
        System.out.println("this.x and this.y " + this.x + " " + this.y);
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }
}
