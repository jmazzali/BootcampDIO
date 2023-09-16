package app;

import interfaces.Navegador;

public class Macintosh implements Navegador {

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("Método EXIBIR PAGINA em aparelho não multifuncional");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Método ADD NOVA ABA em aparelho não multifuncional");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Método ATUALIZAR PAGINA em aparelho não multifuncional");
	}

}
