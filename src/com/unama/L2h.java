package com.unama;

import java.util.Scanner;

public class L2h {
    public static void main(String[] args){
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        n1 = sc.nextInt();
        if(n1 % 2 == 0){
            System.out.print("Número Par");
        }else{
            System.out.print("Número Ímpar");
        }
    }
}