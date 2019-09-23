package com.unama;

import java.util.Scanner;

public class L3b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, maior, Qidosos, x;
        System.out.print("Digite o número de idosos: ");
        Qidosos = sc.nextInt();
        maior = 0;
        for(x=1;x<=Qidosos;x++){
            System.out.print("Digite a idade do idoso nº"+x+":");
            idade = sc.nextInt();
            if(idade > maior){
                maior = idade;
            }
        }
        System.out.println("O idoso com maior idade tem "+maior+" anos!");
    }
}