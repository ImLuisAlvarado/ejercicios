/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.ejercicios;

import java.util.Scanner;

/**
 *
 * @author darkheaven
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        while (true){ 
            
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        
        String palabraInversa = "";
        
        for(int i = palabra.length() - 1; i >= 0; i--) {
	palabraInversa = palabraInversa + palabra.charAt(i);
        }
        
        if (palabra.toLowerCase().equals(palabraInversa.toLowerCase())){
            System.out.println("La palabra "+palabra+" si es un palindromo");
        }
        else{
            System.out.println("La palabra "+palabra+" no es un palindromo");
        }
        
        System.out.println("¿Desea intentar con otra palabra? (s/n)");
        String respuesta = sc.nextLine();
        
        if (respuesta.toLowerCase().equals("s")){
        }
        else{
            break;
        }
        }        
    }
}

        
        
        
