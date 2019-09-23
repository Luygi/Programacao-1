package com.unama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class d {
    public static void main(String[] args){
        double raio;
        double area;
        double perimetro;
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio em centímetros: ");
        raio = sc.nextDouble();
        area = Math.PI*Math.pow(raio,2);
        perimetro = 2*Math.PI*raio;
        System.out.println("O valor da área da circunferência é de "+formatador.format(area)+"cm² e o valor do perímetro é de "+formatador.format(perimetro)+"cm" );
        sc.close();


    }
}
