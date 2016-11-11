package br.com.unirio.PM_ProcessasmentoDeTexto;

public class Algoritmo {
	protected String nome;

	public Algoritmo(String nome) {
		this.nome = nome;
	}

	public Algoritmo clone() {
		return new Algoritmo(nome);
	}

	public String executa(String frase) {

		return "";
	}
}
