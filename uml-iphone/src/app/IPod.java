package app;

import interfaces.Reprodutor;

public class IPod implements Reprodutor {

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Método TOCAR em aparelho não multifuncional");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Método PAUSAR em aparelho não multifuncional");
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Método SELECIONAR MUSICA em aparelho não multifuncional");
	}

}
