package com.rumindu;
//Main.java
public class Main {
    public static void main(String[] args) {
        //array of controls
        //particle scenario is rendering a form with multiple UI Control components
        // (ex-few TextBoxes and CheckBoxes in a form
        UIControl[] controls = {new TextBox(), new CheckBox()};
        //procedural approach of call rendering different controls objects
        /*for (var control : controls) {
            if control is TextBox
              renderTextBox()
            else if control is CheckBox
              renderCheckBox()
        }*/

        //Implementing polymorphism for rendering controls object
        //Here, a control object is taking many different shapes according to the array element
        for (var control : controls) {
            control.render();
        }
    }
}
