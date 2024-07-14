package com.rumindu;
//Main.java
public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        //passing textBox object.
        show(textBox);
    }
    //casting TextBox class textBox object to UIControl class type object
    //this is called upcasting
    //here type can be Object ex - public static void show(UIControl control){...
    public static void show(Object control){
        //call toString() method of TextBox class
        System.out.println(control);//output: ""
    }
}
