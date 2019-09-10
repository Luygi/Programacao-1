package com.unama;

import java.util.Scanner;

public class pf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int falta;
        float nota;
        System.out.println("Digite o número de faltas: ");
        falta = sc.nextInt();
        System.out.println("Digite a nota do aluno: ");
        nota = sc.nextFloat();
        if((falta <= 40)&&(nota >= 6)){
            System.out.println("Aluno Aprovado!");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
}