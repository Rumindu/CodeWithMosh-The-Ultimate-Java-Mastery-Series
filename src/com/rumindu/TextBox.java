package com.rumindu;
//child class
//TextBox.java
public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(false);
        System.out.println("TextBox");
    }
    //Overriding toString() methods that declared in Object class.
    //Object class is great parent class of TextBox class
//    @Override
//    public String toString(){
//    return text;
//    }

    public void setText(String text) {
        this.text = text;
    }
    public void clearText() {
        text = "";
    }
}
