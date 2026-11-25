package com.mycompany.cleverinternshipp;

public class Palindromos {

    public static boolean sonPalindromos(String inputStr) {

        if (inputStr == null) {
            return false;
        }

        int izquierda = 0;
        int derecha = inputStr.length() - 1;

        while (izquierda < derecha) {

            if (inputStr.charAt(izquierda) != 
                inputStr.charAt(derecha)) {
                return false;
            }

            izquierda++;
            derecha--;
        }

        return true;
    }
}

