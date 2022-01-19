package br.com.dio.model.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        //declara as variaveis e instacia o scaner
        double a,b;
        Scanner scan = new Scanner(System.in);

        //preenche as variaveis com valores digitados pelo usuario
        System.out.println("Insira o primeiro numero:");
        a= scan.nextDouble();
        System.out.println("Insira o segundo numero:");
        b= scan.nextDouble();

        //chama as funçoes e prina os resultados
        System.out.println(a+ "+" + b + " = " + soma(a,b));
        System.out.println(a+ "-" + b + " = " + sub(a,b));
        System.out.println(a+ "/" + b + " = "+ div(a,b));
        System.out.println(a+ "x" + b + " = "+ mult(a,b));
    }


//------------------ Faz a soma -----------------------------
    public static Double soma (Double a, Double b){
        return a+b;
    }

//------------------ Faz a subtração -------------------------
    public static Double sub (Double a, Double b){
        return a-b;
    }

//------------------ Faz a multiplicação ----------------------
    public static Double mult (Double a, Double b){
        return a*b;
    }

//------------------ Faz a divisão ----------------------------
    public static Double div (Double a, Double b){
        return a/b;
    }
}
