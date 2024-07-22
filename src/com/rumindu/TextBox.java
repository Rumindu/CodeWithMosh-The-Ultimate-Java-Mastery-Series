package com.rumindu;
//child class
//TextBox.java
public class TextBox extends UIControl {
    private String text = "";

    //Implementing an abstract method
    //no need to put @Override annotation. But it's a good practice to put it.
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
