/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cleverinternshipp;

import java.util.Arrays;

/**
 *
 * @author ramir
 */
public class CleverInternshipp {
    
    public static void main(String[] args){
        //ejercicio 1
        System.out.println(SumaDigitos.digitsSum(999));
        System.out.println(SumaDigitos.digitsSum(9184501));
        System.out.println(SumaDigitos.digitsSum(12345));
        
        System.out.println("\n");
        //ejercicio 2
        System.out.println(Palindromos.sonPalindromos("aabaa"));
        System.out.println(Palindromos.sonPalindromos("abac"));
        System.out.println(Palindromos.sonPalindromos("salas"));
        
        System.out.println("\n");

        //ejercicio 3
        int[] numeros = {5, -2, 10, 0, 3, -7};

        int[] ordenados = Ordenamiento.integerSort(numeros);

        System.out.println("Arreglo original: " 
                + Arrays.toString(numeros));

        System.out.println("Arreglo ordenado: " 
                + Arrays.toString(ordenados));
    }
        
    }
