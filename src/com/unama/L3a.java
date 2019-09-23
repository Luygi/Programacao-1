package com.unama;

import java.util.Scanner;

public class L3a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota, notaT;
        int avaliacoes, x;
        System.out.print("Digite o número de avaliações: ");
        avaliacoes = sc.nextInt();
        x = 1;
        notaT = 0;
        System.out.print("Digite o número de avaliações: ");
        while(x<=avaliacoes){
            System.out.print("Digite a "+x+"ª nota: ");
            nota = sc.nextFloat();
            if(nota>=0 && nota<= 10){
                notaT = notaT + nota;
                x++;
            }else{
                System.out.println("[ERROR]Insira um valor entre 0 10, tente novamente!");
            }
        }
        float media = notaT/avaliacoes;
        System.out.println("A sua média é igual a: "+media+".");
    }
}