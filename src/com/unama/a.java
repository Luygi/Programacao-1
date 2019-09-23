package com.unama;

import java.util.Scanner;

public class a {

    public static void main(String[] args){
        String nome;
        int idade;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        System.out.println("O seu nome é "+nome+" e sua idade é de "+idade+" anos.");
        sc.close();
    }
}
