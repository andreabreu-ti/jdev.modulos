package jdev.modulos.modulo15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasLocalDatePlusMinus {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		for(int mes = 1;  mes <= 12; mes++) {
			dataBase.plusMonths(1);
			System.out.println("Data de vencimento do boleto: "+ 
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ "do mes: "+mes);
		}
		
		System.out.println("Mais 5 dias: "+ (dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 Semanas: "+ (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 Anos: "+ (dataBase = dataBase.plusYears(5)));
		System.out.println("Mais 2 Meses: "+ (dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Menos 1 Ano: "+ (dataBase = dataBase.minusYears(1)));
		System.out.println("Menos 1 Mes: "+ (dataBase = dataBase.minusMonths(1)));
		System.out.println("Menos 20 dias: "+ (dataBase = dataBase.minusDays(20)));

	}

}
