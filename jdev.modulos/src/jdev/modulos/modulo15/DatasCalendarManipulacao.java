package jdev.modulos.modulo15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasCalendarManipulacao {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();
		
		//Simular que data vem do banco de dados
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		
		calendar.add(Calendar.DAY_OF_MONTH, -40); //Data de Hoje mais 40 dias
		System.out.println("Somando dia do mes: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1); //Somando 1 mês 
		System.out.println("Somando o mes: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1); //Somando 1 mês 
		System.out.println("Somando 1 ano: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
	}

}
