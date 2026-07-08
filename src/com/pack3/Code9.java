package com.pack3;

//import java.util.*;

public class Code9 {
    public static void main(String[] args) {
        double finalPrice=1299.75;
        //int billedAmount=1299;
        int billedAmount=(int) finalPrice;

        System.out.println("Final Price (with tax): "+finalPrice);
        System.out.println("Billed Amount: "+billedAmount);

        if(finalPrice!=billedAmount)
        {
            System.out.println("Note: Paise ignored in billing.");
        }
        
    }
}

