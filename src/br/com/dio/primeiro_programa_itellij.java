package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Scanner;

public class primeiro_programa_itellij {
    public static void main(String[] args) {
        double a,b;
        Gato gato = new Gato("Lani","marrom", 2);
        Scanner scan= new Scanner(System. in);
        System.out.println(gato);
        scan.close();
    }
}
