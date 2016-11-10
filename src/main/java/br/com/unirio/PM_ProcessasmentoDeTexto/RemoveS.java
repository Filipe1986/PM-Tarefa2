package br.com.unirio.PM_ProcessasmentoDeTexto;

public class RemoveS extends Algoritmo {

	@Override
	public String executa(String frase) {

		return frase;
	}

	@Override
	public RemoveS clone() {
		return new RemoveS();
	}

}
