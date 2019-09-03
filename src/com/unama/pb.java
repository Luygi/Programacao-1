package com.unama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pecas;
        int pecasD;
        float porcentagem;
        System.out.println("Informe o número de peças produzidas: ");
        pecas = sc.nextInt();
        System.out.println("Informe o número de peças defeituosas");
        pecasD = sc.nextInt();
        porcentagem = pecasD*100/pecas;
        if(porcentagem>10){
            System.out.println("A máquina precisa de manutenção");
        }else{
            System.out.println("A máquina não precisa de manutençõ");
        }
    }
}
