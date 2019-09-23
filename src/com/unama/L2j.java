package com.unama;

import java.util.Scanner;

public class L2j {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        float nota1, nota2, nota3;
        float npreciso, nexame, med;
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("Digite a 1ª nota: ");
        nota1 = sc.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        nota2 = sc.nextFloat();
        System.out.print("Digite a 3ª nota: ");
        nota3 = sc.nextFloat();
        med = ((nota1+nota2+nota3)/3);
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("C O N D I Ç Õ E S   P A R A   A P R O V A Ç Ã O");
        System.out.println("-----------------------------------------------");
        System.out.println("      MÉDIA ARITMÉTICA      |     MENSAGEM     ");
        System.out.println("      [0,0 ------ 3,0[      |     Reprovado    ");
        System.out.println("      [3,0 ------ 7,0[      |       Exame      ");
        System.out.println("      [7,0 ------ 10,0]     |     Aprovado    ");
        if (med>= 0 && med<3) {
            System.out.println("Você está Reprovado!!");
        }else if(med >=3 && med <7){
            System.out.println(nome+" você tem que fazer o exame!");
            System.out.println("Digite a nota que você especula tirar no exame: ");
            nexame = sc.nextFloat();
            npreciso = 6 - ((nota1+nota2+nota3+nexame)/4);
            if(npreciso > 0 && npreciso < 6){
                System.out.println("A nota que você precisa a mais da qual você especula tirar é de"+npreciso*4+" ponto(s).");
            }else{
                System.out.println(nome+" você está Aprovado!");
            }
        }else{
            System.out.println(nome+" você está Aprovado!");
        }
        sc.close();
    }
}