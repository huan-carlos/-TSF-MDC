package com.mycompany.mdc;

public class MathUtil {

    public static int mdc(int a, int b) {
        //P1
        if(b > 0 && a % b == 0){
            return b;
        }
        
        
        return -1;
    }
}
