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

        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaNumPrimos = new ArrayList<>();
        List<Integer> listaNumPares = new ArrayList<>();

        while (true) {
            listaNumeros.clear();
            listaNumPrimos.clear();
            listaNumPares.clear();

            for (int i = 0; i < 10; i++) {
                int numero = random.nextInt(100);
                listaNumeros.add(Integer.valueOf(numero));
            }
            int numeroMayor = listaNumeros.getFirst();
            int numeroMenor = listaNumeros.getFirst();
            int promedio = 0;
            int iteraciones = 0;
            
            for (int n : listaNumeros) {
                
                if(n % 2 == 0){
                    listaNumPares.add(n);
                }
                
                boolean esPrimo = true;
                if (n < 2) {
                    esPrimo = false;
                } else {
                    for (int i = 2; i * i <= n; i++) {
                        if (n % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }
                if (esPrimo) {
                    listaNumPrimos.add(n);
                }
                
                if (n>numeroMayor){
                    numeroMayor = n;
                }
                if (n<numeroMenor){
                    numeroMenor = n;
                }
            iteraciones++;
            promedio += n;
            }
            System.out.println("Lista de números generados:");
            System.out.println(listaNumeros);
            System.out.println("Promedio: " + (promedio / iteraciones));
            System.out.println("Números primos generados: " + listaNumPrimos);
            System.out.println("Números pares generados: " + listaNumPares);
            System.out.println("Número mayor: " + numeroMayor);
            System.out.println("Número menor: " + numeroMenor);
            
            System.out.println("¿Desea terminar el programa? (s/n)");
            String respuesta = sc.nextLine();

            if (respuesta.toLowerCase().equals("s")) {
                break;
            }
        }
    }
}
