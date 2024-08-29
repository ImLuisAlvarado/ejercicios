/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author darkheaven
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        List<String> listaNumeros = new ArrayList<>();

        while (true) {
            listaNumeros.clear();

            for (int i = 0; i < 10; i++) {
                int numero = random.nextInt(100);
                listaNumeros.add(String.valueOf(numero));
            }

            for (String n : listaNumeros) {
                System.out.println(n);
            }

            System.out.println("¿Desea terminar el programa? (s/n)");
            String respuesta = sc.nextLine();

            if (respuesta.toLowerCase().equals("s")) {
                break;
            }
        }
    }
}
