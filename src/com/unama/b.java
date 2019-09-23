package com.unama;

import java.util.Scanner;

public class b {

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        n = sc.nextInt();
        System.out.println("O dobro de "+n+" é igual a "+n*2);
        sc.close();
    }
}
