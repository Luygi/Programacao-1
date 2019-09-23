package com.unama;

import java.util.Scanner;

public class L2l{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float salario;
        int codigo;
        System.out.println("Digite o valor do seu salário: ");
        salario = sc.nextFloat();
        System.out.println("-------C Ó D I G O-------");
        System.out.println("  ESCRITURÁRIO ----- [1] ");
        System.out.println("   SECRETÁRIO  ----- [2] ");
        System.out.println("     CAIXA     ----- [3] ");
        System.out.println("    GERENTE    ----- [4] ");
        System.out.println("    DIRETOR    ----- [5] ");
        System.out.println("-------------------------");
        System.out.println("Digite o código correspondente ao seu cargo: ");
        codigo = sc.nextInt();
        switch(codigo){
            case 1:
                System.out.println("------------------------");
                System.out.println("E S C R  I T U R Á R I O");
                System.out.println("Valor de aumento: 50%");
                salario =  salario*50/100 + salario;
                System.out.println("Novo Salário: R$"+salario);
                break;
            case 2:
                System.out.println("------------------------");
                System.out.println("  S E C R E T Á R I O   ");
                System.out.println("Valor de aumento: 35%");
                salario =  salario*35/100 + salario;
                System.out.println("Novo Salário: R$"+salario);
                break;
            case 3:
                System.out.println("------------------------");
                System.out.println("       C A I X A        ");
                System.out.println("Valor de aumento: 20%");
                salario =  salario*20/100 + salario;
                System.out.println("Novo Salário: R$"+salario);
                break;
            case 4:
                System.out.println("------------------------");
                System.out.println("     G E R E N T E      ");
                System.out.println("Valor de aumento: 10%");
                salario =  salario*10/100 + salario;
                System.out.println("Novo Salário: R$"+salario);
                break;
            case 5:
                System.out.println("------------------------");
                System.out.println("     G E R E N T E      ");
                System.out.println("Você não tem aumento!");
                break;
            default:
                System.out.println("Este não é um valor válido!");
        }
        sc.close();
    }
}