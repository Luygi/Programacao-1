package com.unama;

import java.util.Scanner;

public class i {
    public static void main(String[] args){
        float total;
        float valor;
        float desconto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: R$");
        valor = sc.nextFloat();
        System.out.println("Digite o percentual de desconto, considerando 1 como 100%: ");
        desconto = sc.nextFloat();
        total = valor-(valor*desconto);
        System.out.println("O valor da compra é igual a R$"+total); 
        sc.close();
    }
}