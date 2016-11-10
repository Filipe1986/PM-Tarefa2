package br.com.unirio.PM_ProcessasmentoDeTexto;

public class RemovePontuacao extends Algoritmo {

	@Override
	public String executa(String frase) {

		return frase;
	}

	@Override
	public RemovePontuacao clone() {
		return new RemovePontuacao();
	}

}
