package com.pack3;

//import java.util.*;

public class Code6 {
    public static void main(String[] args) {
        double actualDistance=12.78;
        int roundedDistance=(int) actualDistance;

        double recalculatedDistance=roundedDistance;

        

        System.out.println("Actual Distance: "+actualDistance+" km");
        System.out.println("Rounded Distance: "+roundedDistance+" km");
        System.out.println("Recalculated Distance: "+recalculatedDistance+" km");

        if(actualDistance-roundedDistance>0.5)
        {
            System.out.println("Warning: Distance rounding may affect fare!");
        }
        else
        {
            System.out.println("Lets GO");
        }
        
    }
}
