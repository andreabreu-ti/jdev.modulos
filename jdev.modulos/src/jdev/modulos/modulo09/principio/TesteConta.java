package jdev.modulos.modulo09.principio;


//AULA - EXTRA - Princípio da Responsabilidade Única - SOLID
public class TesteConta {

	public static void main(String[] args) {

		ContaBancaria bancaria = new ContaBancaria();
		
		bancaria.setDescricao("Conta bancaria do Alex");
		System.out.println(bancaria);
		
		bancaria.diminui100reais();
		bancaria.diminui100reais();
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		System.out.println(bancaria);
		
		bancaria.soma100reias();
		System.out.println(bancaria);
		
		String string = new String();
		
	}

}
