//main.java
package com.codewithrumindu;
//If the class is from the different package, we need to import it
import com.rumindu.UIControl;

public class Main {
    public static void main(String[] args) {
        System.out.println(new UIControl(true).isEnabled);
    }
}
