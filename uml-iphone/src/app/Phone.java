package app;

import interfaces.Comunicador;

public class Phone implements Comunicador {

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Método LIGAR em aparelho não multifuncional");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Método ATENDER em aparelho não multifuncional");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Método CORREIO DE VOZ em aparelho não multifuncional");
	}

}
