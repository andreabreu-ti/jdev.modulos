package jdev.modulos.modulo08;

public class RepeticaoWHILEeDOWHILE {

	public static void main(String[] args) {

		/* Estrutura de repetição WHILE -> Primeiro verifica e depois executa*/

		int numero = 0;

		while (numero <= 10) {
			System.out.println("WHILE - O numero atual eh: " + numero);
			numero++;
		}
		
		/* Estrutura de repetição DO WHILE -> Primeiro executa e depois verifica*/

		int numero2 = 0;

		do {
			System.out.println("DO WHILE - O numero atual eh: " + numero2);
			numero2++;
		} while (numero2 <= 60);


	}

}
