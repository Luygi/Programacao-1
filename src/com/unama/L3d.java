package com.unama;

import java.util.Scanner;

public class L3d{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Qelei, L1, L2, L3, x;
        int l;
        System.out.println("    V O T A  Ç Ã O   ");
        System.out.println("---------------------");
        System.out.println("C A N D I D A T O S: ");
        System.out.println("MARIA[1] MATHEUS[2] BEATRIZ[3]");
        System.out.println("");
        System.out.print("Digite a quantidade de eleitores: ");
        Qelei = sc.nextInt();
        L1 = 0;
        L2 = 0;
        L3 = 0;
        for(x=0; x<Qelei; x++){
            System.out.println("Digite o número correspondente ao seu candidato: ");
            l = sc.nextInt();
            if(l == 1 ){
                L1 = 1+L1;
            }else if(l == 2){
                L2 = 1+L2;
            }else{
                L3 = 1+L3;
            }
        }
        System.out.println("---------------------");
        System.out.println("RESULTADO DA VOTAÇÃO");
        System.out.println("---------------------");
        System.out.println("MARIA:   "+L1+" VOTO(S)");
        System.out.println("MATHEUS: "+L2+" VOTO(S)");
        System.out.println("BEATRIZ: "+L3+" VOTO(S)");
    }
}