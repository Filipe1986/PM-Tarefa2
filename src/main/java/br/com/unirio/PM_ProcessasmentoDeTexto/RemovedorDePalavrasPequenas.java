package br.com.unirio.PM_ProcessasmentoDeTexto;

public class RemovedorDePalavrasPequenas extends Algoritmo {

	public RemovedorDePalavrasPequenas(String nome) {
		super(nome);

	}

	public String executa(String frase) {
		frase = frase.replaceAll("\\s[-a-zA-Z0-9][-a-zA-Z0-9][-a-zA-Z0-9]\\s", " ");
		frase = frase.replaceAll("\\s[-a-zA-Z0-9][-a-zA-Z0-9]\\s", " ");
		frase = frase.replaceAll("\\s[-a-zA-Z0-9]\\s", " ");
		return frase;
	}

	public RemovedorDePalavrasPequenas clone() {
		return new RemovedorDePalavrasPequenas(nome);
	}

}
