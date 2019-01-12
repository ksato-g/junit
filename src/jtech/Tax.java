package jtech;

public class Tax {
    public int taxIn(int price){
        double taxRate = 0.08;
        int postTax = (int)(price * (1 + taxRate));
//        int postTax = (int)(price * (taxRate));
        return postTax;
    }

}
