package com.company;

public class Main {

    public static void main(String[] args) {
        Algoritmos algoritmos = new Algoritmos();
        algoritmos.setCantidad(10);

        int[] primosArray = algoritmos.primos(algoritmos.getCantidad());
        int[] fibonacciArray = algoritmos.fibonacci(algoritmos.getCantidad());

        System.out.println("Números primos:");
        for (int i = 0; i<primosArray.length; i++) {
            if (i != primosArray.length-1) {
                System.out.print(primosArray[i]+", ");
            } else {

                System.out.println(primosArray[i]);
            }
        }

        System.out.println("Sucesión de Fibonacci:");
        for (int i = 0; i<fibonacciArray.length; i++) {
            if (i != fibonacciArray.length-1) {
                System.out.print(fibonacciArray[i]+", ");
            } else {
                System.out.println(fibonacciArray[i]);
            }
        }

    }
}