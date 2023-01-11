package me.dio.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) throws Exception {

        //Operadores unários
        int numero = 5;
        //transformando o número 5 positivo em numero 5 negativo
        numero = - numero;
        System.out.println(numero);

        //transformando o numero negativo em positivo
        numero = numero  -1;

        System.out.println(numero);

        /**
         * Incrementar ou decrementar um valor
         */

         int n = 2;
         int n2 = 6;
         //n = n +2;
        n += 2;
        n2 -= 1;
        System.out.println("Valor de n: " + n + "\nValor de n2: " + n2);
        n++;
        System.out.println("Valor de n: " + ++n + "\nValor de n2: " + --n2);//primeiro incrementa o valor e depois imprime o valor incrementado.


        /**
         * Negação de um valor na variável
         */
        boolean valor = true;
        valor = !valor;
        System.out.println(valor);
    }

}