package com.unama;

import java.util.Scanner;

public class pd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float l1;
        float l2;
        float l3;
        System.out.println("-----------------\n|É um triângulo?|\n-----------------");
        System.out.print("Informe o tamanho do 1º lado em centímetros: ");
        l1 = sc.nextFloat();
        System.out.print("Informe o tamanho do 2º lado em centímetros: ");
        l2 = sc.nextFloat();
        System.out.print("Informe o tamanho do 3º lado em centímetros: ");
        l3 = sc.nextFloat();
        if((l1<l2+l3) && (l2<l1+l3) && (l3<l1+l2)){
            System.out.println("-----------------\n|É um triângulo!|\n-----------------");
        }else{
            System.out.println("---------------------\n|Não é um triângulo!|\n---------------------");
        }
    }
}
