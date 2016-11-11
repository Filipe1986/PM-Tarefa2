package br.com.unirio.PM_ProcessasmentoDeTexto;

public class Singularizador extends Algoritmo {

	public Singularizador(String nome) {
		super(nome);

	}

	public String executa(String frase) {
		frase = frase.replaceAll("s\\s", " ");
		if (frase.endsWith("s")) {
			frase = frase.substring(0, frase.length() - 1);
		}
		return frase;
	}

}
