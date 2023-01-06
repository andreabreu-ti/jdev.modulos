package jdev.modulos.modulo15;

import java.time.LocalDate;
import java.time.Period;

public class DatasObjetoPeriod {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(2019, 2, 7);
		LocalDate dataNova = LocalDate.of(2021, 7, 4);
		
		System.out.println("Data antiga e maior que data nova: "+dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga e anterior que data nova: "+dataAntiga.isBefore(dataNova));
		System.out.println("Datas sao iguais?: "+dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias : "+periodo.getDays());
		System.out.println("Quantos meses : "+periodo.getMonths());
		System.out.println("Quantos Anos : "+periodo.getYears());
		System.out.println("Periodo eh: Anos "+periodo.getYears()+" Anos "+periodo.getMonths()+" meses "+periodo.getDays()+" dias.");
		System.out.println("Somentes meses : "+periodo.toTotalMonths());
	}

}
