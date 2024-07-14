package com.rumindu;
//child class
//TextBox.java
public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(false);
    }

    @Override
    public String toString(){
    return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void clearText() {
        text = "";
    }
}
