//UIControl.java
package com.rumindu;

public class UIControl{
    //default access modifier.
    //Don't provide any access modifier prefix
    boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled=isEnabled;
        System.out.println("UIControl");
    }

    public void enable(){
        isEnabled = true;
    }


    public void disable(){
        isEnabled= false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}