/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author darkheaven
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        while (true){
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese apellido paterno: ");
        String apellidoPaterno = sc.nextLine();

        System.out.print("Ingrese apellido materno: ");
        String apellidoMaterno = sc.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese año de nacimiento: ");
        String anioNacimiento = sc.nextLine();

        System.out.print("Ingrese mes de nacimiento (1-12): ");
        String mesNacimiento = sc.nextLine();

        System.out.print("Ingrese día de nacimiento (1-31): ");
        String diaNacimiento = sc.nextLine();
    

        String inicialesPaterno = apellidoPaterno.substring(0, 2).toUpperCase();
        String inicialMaterno = apellidoMaterno.substring(0, 1).toUpperCase();
        String inicialNombre = nombre.substring(0, 1).toUpperCase();
        String digitosAnio = anioNacimiento.substring(anioNacimiento.length()-2);
        String digitoMes = String.format("%02d", Integer.parseInt(mesNacimiento));
        String digitoDia = String.format("%02d", Integer.parseInt(diaNacimiento));
        
        System.out.println("\nRFC: "+inicialesPaterno+inicialMaterno+inicialNombre+digitosAnio+digitoMes+digitoDia);

        System.out.println("\n¿Desea terminar el programa? (s/n)");
            String respuesta = sc.nextLine();

            if (respuesta.toLowerCase().equals("s")) {
                break;
        }
     }
   }
}
