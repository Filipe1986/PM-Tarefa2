package br.com.unirio.PM_ProcessasmentoDeTexto;

public class App {
	public static void main(String[] args) {

		String texto = "$#@!-()*&¨%$# Algumas palavras no plural e outras pequenas, juntas a pontuação para testar o programa...!!!";
		String ordem = " RP, S, RPP";

		ordem = ordem.replace(" ", "").toUpperCase();

		String[] tipos = ordem.split(",");

		System.out.println(texto);
		for (int i = 0; i < tipos.length; i++) {
			System.out.println(tipos[i]);
			Algoritmo a = FabricaDeAlgoritmo.pegaInstancia(tipos[i]);
			texto = a.executa(texto);
			System.out.println("E o texto é:");
			System.out.println(texto);
		}

	}

}
