package jdev.modulos.modulo9.classes;

/*Está é a nossa classe/objeto que representa o Aluno*/
public class Aluno {

	// Definição de Atributos - esses são os atributos do Aluno
	public String nome;
	public int idade;
	public String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	public Aluno() { /* Cria os dados na memória - sendo padrão do Java */

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
