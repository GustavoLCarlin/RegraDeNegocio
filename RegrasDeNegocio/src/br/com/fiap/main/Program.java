package br.com.fiap.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.fiap.entity.Contrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat forData= new SimpleDateFormat("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Numero: ");
		int numero = scanner.nextInt();
		
		System.out.println("Coloque a data");
		System.out.print("Data (dd/MM/yyyy) : ");
		String data1 = scanner.next();
		Date data = forData.parse(data1);
		
		System.out.print("Valor do contrato: ");
		double valor = scanner.nextDouble();
		
		System.out.print("Quantidade de parcelas: ");
		int parcelas = scanner.nextInt();
		
		Contrato contrato = new Contrato(numero, data, valor, parcelas);
		contrato.CalculoParcelas(contrato);
		
		
	
	}

}
