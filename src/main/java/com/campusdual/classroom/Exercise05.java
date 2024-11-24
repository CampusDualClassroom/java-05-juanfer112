package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {

    }

    //TODO ↓
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    /**
     * Compara dos números y determina si el primero es menor, igual o mayor al segundo.
     *
     * @param n1 Primer número.
     * @param n2 Segundo número.
     */
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if(n1 < n2 ) {
            System.out.println(n1 + " es menor que " + n2);
        } else {
            System.out.println(n1 + " es mayor o igual que " + n2);
        }
    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es múltiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es múltiplo de Y
    /**
     * Comprueba si el primer número es múltiplo del segundo.
     *
     * @param n1 Primer número.
     * @param n2 Segundo número.
     */
    public static void checkMultiply(int n1, int n2) {
        if (n2 == 0) throw new IllegalArgumentException("División por cero no permitida.");

        if(n1 % n2 == 0 ) {
            System.out.println(n1 + " es multiplo de " + n2);
        } else {
            System.out.println(n1 + " no es multiplo de " + n2);
        }
    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    /**
     * Determina si un número es positivo, negativo .
     *
     * @param num Número a verificar.
     */
    public static void checkPositiveNegative(int num) {
        if(num >= 0 ) {
            System.out.println(num + " es positivo.");
        } else {
            System.out.println(num + " es negativo.");
        }
    }
}
