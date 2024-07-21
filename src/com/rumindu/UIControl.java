package com.rumindu;
//parent class
//UIControl.java
public class UIControl{
    private boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//        this.isEnabled=isEnabled;
//    }
    public void render(){
        //this method doesn't have any implementation.
        //Implementation depends on type of object(checkBox, textBox, etc
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