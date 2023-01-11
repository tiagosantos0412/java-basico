package me.dio.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        /*
         * Programa de cálculo de IMC para ilustrar os Operadores Lógicos
         */

        double altura = 1.75;
        double peso = 110;
        int imc = (int)calcularImc(altura, peso);

        exibirImc(imc);


    }

    public static double calcularImc(double altura, double peso){
        double imc = peso / Math.pow(altura, altura);
        return imc;
    }

    public static void exibirImc(int imc){
        if(imc <= 18){
            System.out.println("IMC: " + imc + "\nAbaixo do peso normal.");
        }else if(imc > 18 && imc <= 25){
            System.out.println("IMC: " + imc + "\nPeso normal.");
        }else if(imc > 25 && imc <= 30){
            System.out.println("IMC: " + imc + "\nAcima do peso normal.");
        }else if(imc > 30 && imc <=35){
            System.out.println("IMC: " + imc + "\nObesidade nível I");
        }else if(imc >35 && imc <= 40){
            System.out.println("IMC: " + imc + "\nObesidade nível II");
        }else {
            System.out.println("IMC: " + imc + "\nObesidade nível III");
        }
    }
    
}
