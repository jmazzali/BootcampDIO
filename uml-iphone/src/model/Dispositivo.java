package model;

import interfaces.*;

public class Dispositivo implements Comunicador, Navegador, Reprodutor {

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Método LIGAR gerado pelo dispositivo");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Método ATENDER gerado pelo dispositivo");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Método CORREIO DE VOZ gerado pelo dispositivo");
	}

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("Método EXIBIR PAGINA gerado pelo dispositivo");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Método ADD NOVA ABA gerado pelo dispositivo");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Método ATUALIZAR PAGAINA gerado pelo dispositivo");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Método TOCAR gerado pelo dispositivo");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Método PAUSAR gerado pelo dispositivo");
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Método SELECIONAR MUSICA gerado pelo dispositivo");
	}

}
