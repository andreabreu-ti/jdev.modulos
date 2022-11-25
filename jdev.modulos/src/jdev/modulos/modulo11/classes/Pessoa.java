package jdev.modulos.modulo11.classes;

//Herença
//Abstract bloqueia o código diretamente no objeto pessoa
//Classe pai ou a classe master ou a superclasse - Atributos comuns a todos os objetos filhos

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;

	// Metodo abstrado que fica na classe pai é obrigatório para as classes filhas
	// Polimorfismo - Determina o comportamento para as classes filha, ou seja, as
	// classes filhas devem implementar o metodo.
	public abstract double salario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	// Retorna Treu caso seja 18 anos pra cima, senao False
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

}
