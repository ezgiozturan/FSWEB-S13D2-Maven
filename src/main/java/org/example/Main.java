package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome (int number) {
        number =  Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reverse = "";
        for (int i=digits.length-1; i>=0; i--) {
            reverse += digits[i];
        }
           return reverse.equalsIgnoreCase(String.valueOf(number));
    }

  public static boolean isPerfectNumber (int number){
   if (number<0) {
       return false;
   }
        int total = 0;
        for (int i=1 ; i<=number/2 ; i++) {
            if (number%i == 0) {
                total += i;
            }
        }
        return number == total;
  }

  public static String numberToWords (int number) {
   if (number<0) {
       return "Invalid Value";
   }
    char[] digits = String.valueOf(number).toCharArray();
    String numberToText = " ";
    for (char digit:digits) {
        switch (digit) {
            case '0':
                numberToText += "Zero ";
                break;
            case '1':
                numberToText += "One ";
                break;
            case '2':
                numberToText += "Two ";
                break;
            case '3':
                numberToText += "Three ";
                break;
            case '4':
                numberToText += "Four ";
                break;
            case '5':
                numberToText += "Five ";
                break;
            case '6':
                numberToText += "Six ";
                break;
            case '7':
                numberToText += "Seven ";
                break;
            case '8':
                numberToText += "Eight ";
                break;
            case '9':
                numberToText += "Nine ";
                break;
        }
    }
     return numberToText.trim();
  }
}
