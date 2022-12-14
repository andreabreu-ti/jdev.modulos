package jdev.modulos.modulo09.principio;

//AULA - EXTRA - Princípio da Responsabilidade Única - SOLID
public class ContaBancaria {

	private String descricao;

	private double saldo = 8000;

	public void soma100reias() {
		saldo += 100;
	}

	public void diminui100reais() {
		saldo -= 100;
	}

	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}

	public void depositoDinheiro(double deposito) {
		saldo += deposito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}

}
