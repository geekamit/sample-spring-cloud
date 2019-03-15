package com;

public class NthPrime {
    public static void main(String[] args) {
        System.out.println("Nth prime number is "+ nthPrime(10));
    }

    private static boolean nthPrime(int input) {
        if (input % 2 == 0){
            return false;
        }
        return true;
    }


}
