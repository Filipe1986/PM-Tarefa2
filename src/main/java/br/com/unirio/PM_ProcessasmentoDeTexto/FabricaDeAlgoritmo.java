package br.com.unirio.PM_ProcessasmentoDeTexto;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeAlgoritmo {

	private static FabricaDeAlgoritmo algoritmo = null;

	private static Map<String, Algoritmo> algoritmos = null;

	private FabricaDeAlgoritmo() {
		registra();
	}

	public void registra() {
		algoritmos = new HashMap<String, Algoritmo>();
		algoritmos.put("RPP", new RemovedorDePalavrasPequenas("RPP"));
		algoritmos.put("RP", new RemoveDePontuacao("RP"));
		algoritmos.put("S", new Singularizador("S"));
	}

	public static Algoritmo pegaInstancia(String nome) {
		if (algoritmo == null) {
			algoritmo = new FabricaDeAlgoritmo();
		}
		return algoritmos.get(nome);
	}

	public Algoritmo cria(String nomeAlgoritmo) {

		Algoritmo algoritmo = algoritmos.get(nomeAlgoritmo);
		return algoritmo.clone();

	}

}
