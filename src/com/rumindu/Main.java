package com.rumindu;
//main.java
public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        show(control);
    }
    //passing UIControl object as a parameter.
    //here type can be Object ex - public static void show(UIControl control){...
    public static void show(UIControl control){
        //call toString() method of UIControl class
        System.out.println(control);//com.rumindu.UIControl@1b28cdfa
    }
}
