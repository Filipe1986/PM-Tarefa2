package br.com.unirio.PM_ProcessasmentoDeTexto;

public class App {
	public static void main(String[] args) {

		String texto = "$#@!-()*&¨%$# frases que devem mudar diferente de acordo com a "
				+ "entrada de textos diferentes, pois estou implementando "
				+ "um multiton. Que deve eliminar várias palavras de forma "
				+ "como os parametros foram passados...!!!";
		String ordem = "S, RP, RPP";

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
