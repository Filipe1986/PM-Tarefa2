package br.com.unirio.PM_ProcessasmentoDeTexto;

public class RemovePalavrasPequenas extends Algoritmo {

	@Override
	public String executa(String frase) {

		return frase;
	}

	@Override
	public RemovePalavrasPequenas clone() {
		return new RemovePalavrasPequenas();
	}

}
