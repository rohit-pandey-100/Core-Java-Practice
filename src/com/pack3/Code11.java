/*package com.pack3;

//import java.util.*;

public class Code11 {
    private String cardNumber="1234567812345678";
    //private String cardNumber=(int)1234567812345678;
    private String expiryDate="12/26";
    //ExpiryDate in the (MM/YY) Formate

    private Code11(String Encrypts)
    {
        cardNumber=Encrypts;
    }
    public static void main(String[] args) {

    	Code11 a1=new Code11("************5678");

        System.out.println("Card Number: "+a1.cardNumber);
        System.out.println("Enter Expiry Date (MM/YY): "+a1.expiryDate);

        
    }
}*/
// code is right but doesn't full-fill there disc all task and output is also correct 



//second code as per ChatGpt

package com.pack3;

/*import java.util.Scanner;

public class Code11 {

    private String cardNumber;
    private String expiryDate;

    // Constructor
    public Code11(String cardNumber, String expiryDate) {

        // Validate card number
        if (cardNumber.matches("\\d{16}")) {
            this.cardNumber = "************" + cardNumber.substring(12);
        } else {
            this.cardNumber = "Invalid Card Number";
        }

        // Validate expiry date format MM/YY
        if (expiryDate.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            this.expiryDate = expiryDate;
        } else {
            this.expiryDate = "Invalid Expiry Date";
        }
    }

    // Getter method
    public String getCardNumber() {
        return cardNumber;
    }

    // Getter method
    public String getExpiryDate() {
        return expiryDate;
    }

    // Display method
    public void displayCardDetails() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiry Date: " + expiryDate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 16-digit Card Number: ");
        String cardNumber = sc.nextLine();

        System.out.print("Enter Expiry Date (MM/YY): ");
        String expiryDate = sc.nextLine();

        Code11 a1 = new Code11(cardNumber, expiryDate);

        a1.displayCardDetails();

        sc.close();
    }
}*/


// Third code own created as same ChatGpt but some changes are there in this code 

//import java.util.*;

/*public class Code11 {
    private String cardNumber;
    private String expiryDate;

    public Code11(String Number, String Date)
    {
    	
    	cardNumber=Number;
    	expiryDate=Date;
    	
        //cardNumber matching and printing
        if(Number.matches("\\d{16}"))
        {
        	cardNumber="***********"+cardNumber.substring(12);
        }
        else
        {
        	cardNumber="Card Number: Is not valid"; 
        }


        if(Date.matches("(0[0-9]|1[0-2])/\\d{2}"))
        {
        	expiryDate=Date;
        }
        else
        {
        	expiryDate="Invalid Expiry Date";
        }
    }
    public static void main(String[] args) {
    	Code11 CreditCard=new Code11("1234567890123456","02/12");
    	
    	System.out.println(CreditCard.cardNumber);
        System.out.println(CreditCard.expiryDate);
    }
}*/






