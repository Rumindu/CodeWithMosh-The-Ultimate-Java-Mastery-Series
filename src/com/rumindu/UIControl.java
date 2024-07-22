package com.rumindu;
//parent class
//UIControl.java
public abstract class UIControl{
    private boolean isEnabled = true;

    public abstract void render();

    //final method
    public final void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled= false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}