package me.dio.variaveis;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		/**Tipos de variáveis e suas convensões */

		//tipo = double, nome = salario, valor = 2800.00;

		byte idade = 36;
		short anoNascimento = 1986;
		int cep = 19260240;
		long cpf = 36568593885L;
		float pi = 3.14F;
		double salario = 2800.00;

		short numeroCurto = 1;
		//Cast implicito, quando o próprio java faz a conversão de um tipo para o outro
		int numeroNormal = numeroCurto;
		//Cast explicito, quando o desenvolvedor assume a responsabilidade de alterar o tipo da variável
		short novoNumeroCurto = (short) numeroNormal;
		System.out.println("Numero nomral: "+numeroNormal);
		System.out.println("Novo numero curto: "+novoNumeroCurto);

		/** Declaração de uma constante */

		//modificador tipo NOME_EM_CAIXA_ALTA valor

		final double VALOR_DE_PI = 3.14;

	}

}
