package jdev.modulos.modulo11.excecao;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super("Vixx um erro no processamento do arquivo no processamento das notas do aluno. "+ erro);
	}
}
