package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class j {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float valor;
        float dolar;
        float conversao;
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.print("Digite um valor em reais: R$");
        valor = sc.nextFloat(); 
        System.out.print("Digite a cotação do dólar: R$");
        dolar = sc.nextFloat();
        conversao = valor/dolar;
        System.out.print("O valor convertido em dólar é igual a U$"+formatador.format(conversao));
        sc.close();

    }
}