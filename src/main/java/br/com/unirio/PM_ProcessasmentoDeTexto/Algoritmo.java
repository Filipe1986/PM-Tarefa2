package br.com.unirio.PM_ProcessasmentoDeTexto;

public abstract class Algoritmo {
	public String nome;

	public abstract Algoritmo clone();

	public abstract String executa(String frase);
}
