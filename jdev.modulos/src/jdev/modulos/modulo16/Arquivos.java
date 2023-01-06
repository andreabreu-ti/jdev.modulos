package jdev.modulos.modulo16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {

		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("André Abreu");
		
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(30);
		pessoa2.setNome("Pessoa 2");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(45);
		pessoa3.setNome("Fulano de Tal");
		
		//Lista pode vir do banco de dados ou qualquer fonte
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		File arquivo = new File("C:\\Users\\aandd\\git\\jdev.modulos\\jdev.modulos\\src\\jdev\\modulos\\modulo16\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome()+";"+ p.getEmail()+";"+p.getIdade()+"\n");
		}
		
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
