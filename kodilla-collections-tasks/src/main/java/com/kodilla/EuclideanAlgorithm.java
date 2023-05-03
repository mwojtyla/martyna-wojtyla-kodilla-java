package com.kodilla;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 2090;
        int b = 77;

        // Euclidean_algorithm - numbers subtracting
        while (a!=b){
            if (a>b){
                a-=b;
            } else {
                b-=a;
            }
        }
        System.out.println("(1) NWD(a, b)= " + a);


        // Euclidean_algorithm - modulo
        while (a%b!=0 && b!=0){
            int modulo = a%b;
            if (modulo!=0){
                a = b;
                b = modulo;
            }

        }
        System.out.println("(2) NWD(a, b)= " + a);
    }
}
