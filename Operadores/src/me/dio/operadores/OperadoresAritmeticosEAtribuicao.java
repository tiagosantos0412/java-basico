package me.dio.operadores;

public class OperadoresAritmeticosEAtribuicao {
    public static void main(String[] args) throws Exception {

        //Operadores de atribuição
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;

        //Operadores aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        /**
         * ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, 
         * realizará a “concatenação de textos”.
         */

         String primenroNome = "Tiago";
         String sobreNome = "Felipe dos Santos";
         idade = 36;

         System.out.println("Nome completo: " + primenroNome +" " + sobreNome + "\nIdade: " + idade + " anos");
    
    }

}
