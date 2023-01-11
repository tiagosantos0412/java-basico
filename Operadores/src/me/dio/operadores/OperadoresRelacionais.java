package me.dio.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 3;

        String nome1 = "Tiago";
        String nome2 = new String("Tiago");
        
        System.out.println("Numero 1 maior ou igual a numero 2?");
        if(numero1 >= numero2){
            System.out.println("Verdadeiro \n");
        }else{
            System.out.println("Falso \n");
        }

        System.out.println("Numero 1 menor ou igual a numero 2?");
        if(numero1 <= numero2){
            System.out.println("Verdadeiro \n");
        }else{
            System.out.println("Falso \n");
        }

        System.out.println("Numero 1 é igual a numero 2?");
        if(numero1 == numero2){
            System.out.println("Verdadeiro \n");
        }else{
            System.out.println("Falso \n");
        }

        System.out.println("Numero 1 é diferente a numero 2?");
        if(numero1 != numero2){
            System.out.println("Verdadeiro \n");
        }else{
            System.out.println("Falso \n");
        }

        /**
         * Comparações avançadas
         */
        
        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));
    }
}
