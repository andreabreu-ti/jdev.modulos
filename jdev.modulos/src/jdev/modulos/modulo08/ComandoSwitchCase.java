package jdev.modulos.modulo08;

public class ComandoSwitchCase {

	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// SWITCH CASE: Operações Exatas
		switch (media) {
		case 50:
			System.out.println("Recuperação");
			break;
		case 60:
			System.out.println("Recuperação");
			break;
		case 70:
			System.out.println("Aprovado");
			break;
		default:
			System.out.println("Reprovado");
			break;
		}
	}

}
