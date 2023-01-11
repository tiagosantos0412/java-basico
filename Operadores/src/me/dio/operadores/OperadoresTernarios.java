package me.dio.operadores;

public class OperadoresTernarios {
    public static void main(String[] args) throws Exception {
        int a = 6;
        int b = 6;
        String resultado = "";
        /*
            if(a == b) {
                resultado = "Verdadeiro!";
            }else {
                resultado = "Falso";
            }
        */
        //Substituir a condição acima pelo operador ternário
        resultado = a == b ? "Verdadeiro!" : "Falso!";
        System.out.println(resultado);
    }
}
