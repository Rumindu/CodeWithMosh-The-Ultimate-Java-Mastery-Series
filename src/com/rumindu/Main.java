package com.rumindu;
//Main.java
public class Main {
    public static void main(String[] args) {
        //Couldn't create an object from an abstract class
        //var UI = new UIControl;
        UIControl[] controls = {new TextBox(), new CheckBox()};

        for (var control : controls) {
            control.render();
        }
    }
}
