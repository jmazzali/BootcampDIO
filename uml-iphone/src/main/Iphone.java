package main;

import model.Dispositivo;

public class Iphone extends Dispositivo {
	private String numeroSerie;
	private int anoLancamento;
	
	
	
	public Iphone(String numeroSerie, int anoLancamento) {
		this.numeroSerie = numeroSerie;
		this.anoLancamento = anoLancamento;
	}
	
	

	@Override
	public String toString() {
		return "Iphone [numeroSerie=" + numeroSerie + ", anoLancamento=" + anoLancamento + "]\n";
	}


	public static void main(String[] args) {
		Iphone iPhone1 = new Iphone("00001a", 2007);
		System.out.println(iPhone1);
		
		iPhone1.ligar();
		iPhone1.adicionarNovaAba();		
		iPhone1.pausar();
	}
}
