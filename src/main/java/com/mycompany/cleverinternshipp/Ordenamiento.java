package com.mycompany.cleverinternshipp;

public class Ordenamiento {

    public static int[] integerSort(int[] inputArray) {

        if (inputArray == null) {
            return null;
        }

        int[] resultado = inputArray.clone();

        for (int i = 1; i < resultado.length; i++) {

            int actual = resultado[i];
            int j = i - 1;

            while (j >= 0 && resultado[j] > actual) {
                resultado[j + 1] = resultado[j];
                j--;
            }

            resultado[j + 1] = actual;
        }

        return resultado;
    }
}


