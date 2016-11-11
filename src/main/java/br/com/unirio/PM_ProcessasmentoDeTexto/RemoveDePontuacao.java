package br.com.unirio.PM_ProcessasmentoDeTexto;

public class RemoveDePontuacao extends Algoritmo {
	public RemoveDePontuacao(String nome) {
		super(nome);
	}

	public String executa(String frase) {

		frase = frase.replaceAll("[^\\w^\\s]", "");
		return frase;

	}

}
