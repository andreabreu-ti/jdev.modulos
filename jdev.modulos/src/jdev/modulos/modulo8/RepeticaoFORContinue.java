package jdev.modulos.modulo8;

public class RepeticaoFORContinue {

	public static void main(String[] args) {

		// Estrutura de repetição FOR e continue

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero ==6 || numero ==9) {
				System.out.println("Obaaa, encontrei o numero: " + numero);
				continue;
			}
			System.out.println("Procurando numero 3, 6 e 9, numero atual: " + numero);
		}
	}

}
