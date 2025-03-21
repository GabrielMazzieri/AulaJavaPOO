package com.senai.aula5_polimorfismo.exemplos.calculadora;

public class Calculadora {
    int somar(int a, int b){
        System.out.println("int, int");
        return a+b;
    }

    int somar(int a, int b, int c){
        System.out.println("int, int, int");
        return a+b+c;
    }

    double somar(double y, double x){
        System.out.println("double, double");
        return y+x;
    }
    double somar(int a, double b){
        System.out.println("int, double");
        return a+b;
    }

    double somar(double b, int a){
        System.out.println("double, int");
        return a+b;
    }

}
