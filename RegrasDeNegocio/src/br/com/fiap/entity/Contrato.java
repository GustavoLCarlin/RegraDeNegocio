package br.com.fiap.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contrato {
	private int numero;
	private Date data;
	private double valor;
	private int parcelas;
	
	public Contrato(int numero, Date data, double valor, int parcelas) {
		super();
		this.numero = numero;
		this.data = data;
		this.valor = valor;
		this.parcelas = parcelas;
	}
	
	public void CalculoParcelas(Contrato contrato) throws ParseException {
		SimpleDateFormat forData= new SimpleDateFormat("dd/MM/yyyy");
		double valorParcelas = contrato.valor / contrato.parcelas;
		for (int i = 1; contrato.parcelas >= i; i++) {
			
			double valorJuros = valorParcelas + (valorParcelas * 0.01) * i;
			valorJuros += valorJuros*0.02;
			contrato.data.setMonth(contrato.data.getMonth() + 1);
			System.out.println(forData.format(contrato.data) + " - " + valorJuros );
			
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	
	
	
}
