package com.unama;

import java.util.Scanner;

public class e {

    public static void main(String[] args){
        float vendas;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o total de vendas: R$");
        vendas = sc.nextFloat();
        System.out.println("O valor da comissão é igual a R$"+vendas/100*10+".");

    }
}
