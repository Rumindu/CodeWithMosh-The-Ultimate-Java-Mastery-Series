package com.rumindu;
//TextBox.java
//child class
public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(false);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }
    public void clearText() {
        text = "";
    }
}
