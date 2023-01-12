package jdev.modulos.modulo16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

//		FileInputStream entradaArquivo = new FileInputStream(new File(
//				"C:\\Users\\andre_abreu\\git\\jdev.modulos\\jdev.modulos\\src\\jdev\\modulos\\modulo16\\arquivowork.txt"));

		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\aandd\\git\\jdev.modulos\\jdev.modulos\\src\\jdev\\modulos\\modulo16\\arquivohome.txt"));
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			if (linha != null && !linha.isEmpty()) {

				String[] dados = linha.split("\\|");
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
			}

		}
		
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
