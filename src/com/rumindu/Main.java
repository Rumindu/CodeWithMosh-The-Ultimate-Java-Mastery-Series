package com.rumindu;
//Main.java
public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(control);
    }
    public static void show(Object control){
        //insteanceof operator return true if the object is an instance of the specified type
        if(control instanceof TextBox){
            var textBox = (TextBox)control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
