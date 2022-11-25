package jdev.modulos.modulo11.executavel;

import jdev.modulos.modulo10.classes.Aluno;
import jdev.modulos.modulo10.classes.Diretor;
import jdev.modulos.modulo10.classes.Pessoa;
import jdev.modulos.modulo10.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("ANDRE LUIZ");
		aluno.setNomeEscola("JDEV TREINAMENTO");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("545456465");
		diretor.setNome("ANDRE");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("ADMINISTRACAO");
		secretario.setNumeroCpf("888888888888");
		secretario.setIdade(38);
		secretario.setNome("JOÃO");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIndade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do Aluno é = "+aluno.salario());
		System.out.println("Salario do Diretor é = "+diretor.salario());
		System.out.println("Salario do Secfretário é = "+secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = "+ pessoa.getNome() + " e o salário é de = "+ pessoa.salario());
	}
}










