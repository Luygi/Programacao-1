package com.unama;

import java.util.Scanner;

public class f {

    public static void main(String[] args){
        int quant;
        float produto;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor do produto: R$");
        produto = sc.nextFloat();
        System.out.println("Digite a quantidade comprada desse mesmo produto: R$");
        quant = sc.nextInt();
        System.out.println("O valor total da compra é igual a R$"+produto*quant);
        sc.close();
    }
}
