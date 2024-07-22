package com.rumindu;
//child class
//CheckBox.java
//final class
public final class CheckBox extends UIControl{
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}

//compile error - Cannot inherit from final 'com.rumindu.CheckBox'
//public class MyCheckBox extends CheckBox {
//}
