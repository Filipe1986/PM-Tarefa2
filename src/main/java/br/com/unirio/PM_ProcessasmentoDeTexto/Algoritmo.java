package br.com.unirio.PM_ProcessasmentoDeTexto;

public abstract class Algoritmo {
	protected String nome;

	public Algoritmo(String nome) {
		this.nome = nome;
	}

	public abstract Algoritmo clone();

	public abstract String executa(String frase);
}
