package jdev.modulos.modulo7;

public class ConcatenacaoDeVariaveis {

	public static void main(String[] args) {

		// Concatenação = Unir ou Juntar dados

		String nome = "Andre Luiz Cunha de Abreu";
		String cpf = "123.456.789.10";
		String telefone = "(91)987654321";
		String endereco = "Belem - PA";
		int idade = 38;

		String saida = "Meu nome eh: " + nome + " e o meu CPF: " + cpf + " meu contato eh: " + telefone
				+ " e eu moro em: " + endereco + " e tenho de idade: " + idade;

		System.out.println(saida);
	}

}
