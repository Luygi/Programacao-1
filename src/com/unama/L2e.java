package com.unama;

import java.util.Scanner;

public class L2e {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("Digite o 1º número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o 3º número: ");
        n3 = sc.nextInt();
        if((n1<n2)&&(n2<n3)){
            System.out.println(n1+","+n2+","+n3);
        }
        if((n1<n3)&&(n2>n3)){
            System.out.println(n1+","+n3+","+n2);
        }
        if((n2<n1)&&(n3>n1)){
            System.out.println(n2+","+n1+","+n3);
        }
        if((n2<n3)&&(n1>n3)){
            System.out.println(n2+","+n3+","+n1);
        }
        if((n3<n2)&&(n1>n2)){
            System.out.println(n1+","+n2+","+n3);
        }
        if((n3<n1)&&(n2>n1)){
            System.out.println(n1+","+n2+","+n3);
        }
        sc.close();
    }
}
