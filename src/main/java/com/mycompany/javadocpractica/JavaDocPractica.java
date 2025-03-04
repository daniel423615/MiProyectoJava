/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javadocpractica;

/**
 * Clase JavaDocPractica Desarrolla las actividades necesarias para la practica 6.1
 * @author Daniel Dominguez Muela y Jose Enrique Mateo Muñoz
 * @since 1.0
 * @version 1.0
 */
public class JavaDocPractica {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora("Mi calculadora");
        
//        System.out.println(cal.sumar(5, 2)); 
//        float a[] = {10, 5, 0};
//        System.out.println(cal.calcularPromedio(a)); 
        
        try {
            System.out.println(cal.dividir(10, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
