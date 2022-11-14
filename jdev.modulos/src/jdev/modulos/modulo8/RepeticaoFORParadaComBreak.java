package jdev.modulos.modulo8;

public class RepeticaoFORParadaComBreak {

	public static void main(String[] args) {

		// Estrutura de repetição FOR com Break (Parada)

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3) {
				System.out.println("Obaaa, encontrei o numero 3: " + numero);
				System.out.println("Estou parando de executar...");
				break;
			}

		}

	}

}
