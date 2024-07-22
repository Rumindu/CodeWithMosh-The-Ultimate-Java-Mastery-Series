package com.rumindu;
//parent class
//UIControl.java
public abstract class UIControl{
    private boolean isEnabled = true;

    //abstract method doesn't contain a body
    //abstract method must be contained in an abstract class
    //abstract method must be overridden/implement in the child class
    public abstract void render();

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