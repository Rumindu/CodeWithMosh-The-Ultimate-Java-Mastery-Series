package com.rumindu;
//main.java
public class Main {
    public static void main(String[] args) {
        var textBox=new TextBox();
        //override toString() method
        System.out.println(textBox);//TextBox
        //no need to explicitly call toString()
        //System.out.println(textBox.toString());
    }
}
