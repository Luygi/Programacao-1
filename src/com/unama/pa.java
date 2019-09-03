package com.unama;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class pa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int copias;
        double valor;
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.print("Informe a quantidade de cópias: ");
        copias = sc.nextInt();
        if(copias<=10){
            valor = copias*0.25;
            System.out.println("O valor a pagar é de R$"+valor);
        }else{
            valor = copias*0.20;
            System.out.println("O valor a pagar é de R$"+ formatador.format(valor));
        }

    }
}
