package com.unama;

import java.util.Scanner;

public class L2g {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float n1;
        float n2;
        System.out.print("Digite o primeiro valor: ");
        n1 = sc.nextFloat();
        System.out.print("Digite o segundo valor: ");
        n2 = sc.nextFloat();
        if(n1>n2){
            System.out.print("O número "+n1+" é maior que "+n2+".");
        }else{
            System.out.print("O número "+n2+" é maior que "+n1+".");
        }
    }
}