package com.unama;

import java.util.Scanner;

public class g {

    public static void main(String[] args){
        float compri, largu;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a largura da sala em metros: ");
        largu = sc.nextFloat();
        System.out.println("Digite o comprimento da sala em metros: ");
        compri = sc.nextFloat();
        System.out.println("A área da sala é de "+largu*compri+"m²");
    }
}
