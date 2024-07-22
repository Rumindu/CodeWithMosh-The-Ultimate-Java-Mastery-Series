package com.rumindu;
//child class
//TextBox.java
public class TextBox extends UIControl {
    private String text = "";
    @Override
    public void render() {
        System.out.println("Render TextBox");
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
