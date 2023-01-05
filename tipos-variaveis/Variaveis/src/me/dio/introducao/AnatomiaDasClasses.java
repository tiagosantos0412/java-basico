package me.dio.introducao;

//Sintaxe de declaração de uma nova classe:
public class AnatomiaDasClasses {
	
	//corpo da classe

	//declaração do método principal
	public static void main(String[] args) {
		
		/* Declaração de variáveis*/
		
		//tipo //nomeBemDefinido //valor
		
		String primeiroNome = "Tiago";
		
		String segundoNome = "Felipe dos Santos";
		
		int numero1 = 5;
		int numero2 = 10;
		
		/* invocando um método */
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		
		int soma  = somar(numero1, numero2);
		System.out.println(soma);
		
	}
	
	/* Declaração de um método */
	
	// TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}

}
