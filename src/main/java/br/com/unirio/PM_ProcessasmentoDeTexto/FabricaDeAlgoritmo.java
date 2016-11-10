package br.com.unirio.PM_ProcessasmentoDeTexto;

import java.util.ArrayList;

public class FabricaDeAlgoritmo {

	static FabricaDeAlgoritmo algoritmo = null;

	ArrayList<Algoritmo> algoritmos;

	private FabricaDeAlgoritmo() {

		algoritmos = new ArrayList<Algoritmo>();

	}

	private static Object pegaInstancia() {
		return null;
	}

}
