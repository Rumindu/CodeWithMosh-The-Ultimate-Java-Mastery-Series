//UIControl.java
package com.rumindu;

//no need to add this
public class UIControl{
    private boolean isEnabled = true;

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
