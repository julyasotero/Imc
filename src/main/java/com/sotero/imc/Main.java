package com.sotero.imc;

import java.util.Scanner;

public class Main {

    //IMC = peso/(altura x altura)
    private static final Scanner scanf = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(":::...IMC...:::");
        float resultado;
        int peso;
        float altura;

        System.out.println("Iforme peso:");
        peso = scanf.nextInt();

        System.out.println("Iforme altura:");
        altura = scanf.nextFloat();

        resultado = peso / (altura * altura);

        if (resultado < 18.5) {
            System.out.println("Indica magreza");

        } else if ((resultado > 18.5) && (resultado <= 24.9)) {
            System.out.println("Indica normal");

        } else if ((resultado > 25.0) && (resultado < 29.9)) {
            System.out.println("Indica sobrepeso");

        } else if ((resultado == 30.0) || (resultado < 39.9)) {
            System.out.println("Indica obesidade");

        } else if (resultado > 40.00) {
            System.out.println("Indica obesidade grave");
        }
        
        System.out.println("resultado: " + resultado);
        

        System.out.println(":::...FIM IMC...:::");
    }

}
