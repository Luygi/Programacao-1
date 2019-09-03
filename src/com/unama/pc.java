package com.unama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("---------------\n|IDADE NADADOR|\n---------------");
        System.out.print("Informe a sua idade: ");
        idade = sc.nextInt();
        if(idade<=10){
            System.out.println("--------------------\n|CATEGORIA INFANTIL|\n--------------------");
        }else if(idade>10 && idade<=17){
            System.out.println("---------------------\n| CATEGORIA JUVENIL |\n---------------------");
        }else{
            System.out.println("------------------\n|CATEGORIA SENIOR|\n------------------");
        }

    }
}
