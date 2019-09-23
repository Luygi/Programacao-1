package com.unama;

import java.util.Scanner;

public class L3c{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meses, x;
        double capital, juros;
        System.out.print("Informe o valor do capital: ");
        capital = sc.nextFloat();
        System.out.print("Informe o juros: ");
        juros = sc.nextFloat();
        System.out.print("Digite um período em meses: ");
        meses = sc.nextInt();
        juros = juros / 100;
        for(x=1;x<=meses;x++){
            double montante = capital*Math.pow((1+juros),x);
            System.out.println(x+"º mês: "+montante);
        }
        
    }
}