package com.unama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L2i {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sexo;
        double altura, peso_ideal;
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.print("Digite seu sexo (Masculino/Feminino): ");
        sexo = sc.nextLine();
        System.out.print("Digite sua altura: ");
        altura = sc.nextFloat();
        if((sexo.equals("Masculino")) || (sexo.equals("masculino")) || (sexo.equals("MASCULINO"))){
            peso_ideal = 72.7*altura-58;
            System.out.print("Seu peso ideal é igual a "+formatador.format(peso_ideal)+"kg");
        }else{
            peso_ideal = 62.1*altura-44.7;
            System.out.print("Seu peso ideal é igual a "+formatador.format(peso_ideal)+"kg");
        }
    }
}