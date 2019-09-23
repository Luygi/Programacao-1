package com.unama;

import java.util.Scanner;

public class c {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float base;
        float altura;
        System.out.println("Digite a base do triângulo: ");
        base = sc.nextFloat();
        System.out.println("Digite a altura do triângulo: ");
        altura = sc.nextFloat();
        System.out.println("A área do triângulo é igual a "+base*altura/2);
        sc.close();
    }
}
