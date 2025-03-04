/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadocpractica;

import java.lang.reflect.Array;

/**
 * Clase Calculadora Hace calculos numéricos.
 * @author Daniel Dominguez Muela y Jose Enrique Mateo Muñoz
 * @since 1.0
 * @version 1.0
 */
public class Calculadora {
    public String nombre;
    /**
     * Crea un objeto Calculadora
     * @param nombre Es el nombre de la calculadora
     */
    public Calculadora(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Realiza la suma de dos números
     * @param x Primer operando
     * @param y Segundo operando
     * @return Es el resultado de la suma
     */
    public float sumar(float x, float y){
        return x + y;
    }
    /**
     * Realiza la resta de dos números
     * @param x Operando al que se le resta
     * @param y Operando que resta al otro
     * @return Es el resultado de la resta
     */
    public float restar(float x, float y){
        return x - y;
    }
    /**
     * Realiza la multiplicacion de dos números
     * @param x Primer operando
     * @param y Segundo operando
     * @return Es el resultado de la multiplicación
     */
    public float multiplicar(float x, float y){
        return x * y;
    }
    /**
     * Realiza la división de dos números
     * @param x Dividendo
     * @param y Divisor
     * @return Es el resultado de la división
     * @exception IllegalArgumentException Division por cero
     */
    public float dividir(float x, float y){
        if (y == 0) {
            throw new IllegalArgumentException("No se puede dividir entre 0");
        }
        return x / y;
    }
    /**
     * Realiza la potencia de dos números
     * @param base Es la base de la potencia
     * @param exponente Es el exponente de la potencia
     * {@link #multiplicar(float, float) }
     * @return Es el resultado de la potencia
     */
    public float calcularPotencia(float base, float exponente){
        float resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = multiplicar(resultado, base);
        }
        return resultado;
    }
    /**
     * Hace la media
     * @param cifras Array de cifras a calcular
     * @return Resultado de la media de las cifras
     */
    public float calcularPromedio(float cifras[]){
        if (cifras.length == 0) {
            return 0;
        }
        float total = 0;
        for (float cifra : cifras) {
            total += cifra;
        }
        return total / cifras.length;
    }
}
