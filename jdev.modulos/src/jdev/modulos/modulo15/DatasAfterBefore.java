package jdev.modulos.modulo15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasAfterBefore {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2022");
		
		Date dataAtualHoje = simpleDateFormat.parse("07/04/2021");
		
		
		//Se a data 1 é maior que a data 2
		//after - se data 1 é maior que data 2
		//before - se data 1 é menor que data 2
		if(dataVencimentoBoleto.after(dataAtualHoje)) {//Posterior ou maior ou depois da data atual
			System.out.println("Boleto nao vencido");
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}
		
	}

}
