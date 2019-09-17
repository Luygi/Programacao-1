package com.unama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L2k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, n1, n2, n3;
        System.out.println("Digite [1] para somar números");
        System.out.println("Digite [2] para saber a raiz quadrada de um número");
        x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println("Digite o 1º valor");
                n1 = sc.nextInt();
                System.out.println("Digite o 2º valor");
                n2 = sc.nextInt();
                n3 = n1 + n2;
                System.out.println("A soma entre os dois valores é igual a "+n3+"!");
            break;
            case 2:
                System.out.print("Digite um valor: ");
                n1 = sc.nextInt();
                System.out.println("A raiz quadrada de"+n1+"é igual a "+Math.sqrt(n1));
            break;
        }
    }
}