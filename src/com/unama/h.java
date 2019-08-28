package com.unama;

import java.util.Scanner;

public class h {

    public static void main(String[] args){
        float salario, reajuste, sreajuste;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor do salário: R$");
        salario = sc.nextFloat();
        System.out.println("Digite o percentual de reajuste considerando 1 como 100%: ");
        reajuste = sc.nextFloat();
        sreajuste = salario*reajuste+salario;
        System.out.println("O valor do salário reajustado é de "+sreajuste);
    }
}
