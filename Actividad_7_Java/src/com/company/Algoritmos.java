package com.company;

public class Algoritmos {
    private int cantidad = 0;

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int[] primos (int n) {
        int contador = 1;
        int aux = 3;
        int[] primos = new int[n];
        boolean esPrimo = true;

        if (n>0) {
            primos[0] = 2;
        }

        if (n>1) {
            while (contador < n) {

                for (int i = aux - 1; i >= 2; i--) {
                    if (aux % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    primos[contador] = aux;
                    contador++;
                }
                aux++;
                esPrimo = true;
            }
        }
        return primos;
    }

    public int[] fibonacci (int n) {
        int[] fibo = new int[n];
        int n1=0,n2=1,n3;

        if (n>0) fibo[0] = n1;

        if (n>1) fibo[1] = n2;

        if (n>2) {
            for (int i = 2; i < n; ++i) {
                n3 = n1 + n2;
                fibo[i] = n3;
                n1 = n2;
                n2 = n3;
            }
        }
        return fibo;
    }

}
