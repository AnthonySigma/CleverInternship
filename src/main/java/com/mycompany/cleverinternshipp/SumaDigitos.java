package com.mycompany.cleverinternshipp;

public class SumaDigitos {

    public static int digitsSum(int inputInt) {
        int suma = 0;

        while (inputInt != 0) {
            suma += Math.abs(inputInt % 10);
            inputInt /= 10;
        }

        return suma;
    }
}


