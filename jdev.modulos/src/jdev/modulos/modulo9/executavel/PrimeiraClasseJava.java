package jdev.modulos.modulo9.executavel;

import jdev.modulos.modulo9.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* Objeto ainda não existe na memoria */
		Aluno aluno1A;

		/* Agora temos um objeto real na memoria */
		/* new Aluno() é uma instância (Criação de Objeto) */
		/*aluno1 é uma referencia para o objeto aluno*/
		
		
		Aluno aluno1 = new Aluno(); /* Aqui será o João */
		
		aluno1.nome = "Joao";
		aluno1.idade = 38;
		System.out.println("Nome do aluno 1 eh = "+aluno1.nome);
		System.out.println("A idade do "+aluno1.nome+" é "+aluno1.idade);
		
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */
		Aluno aluno3 = new Aluno(); /* Aqui será o André */

		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("José", 50);
	}

}
