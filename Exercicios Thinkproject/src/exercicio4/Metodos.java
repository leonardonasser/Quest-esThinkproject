package exercicio4;

public class Metodos {

	public static boolean ProcurarPalavra(String frase, String palavra) {
		String aux;
		frase = frase + ' ';
		char charFrase[] = frase.toCharArray();

		for (int i = 0; i < frase.length(); i++) {
			aux = "";

			if (frase.charAt(i) == ' ' || i == 0) {
				if (frase.charAt(i) == ' ') {
					i = i + 1;
				}

				for (int j = i; j < frase.length(); j++) {

					if (frase.charAt(j) == ' ') {
						if (aux.equals(palavra)) {
							return true;
						}
					}

					aux = aux + "" + charFrase[j];

				}

			}

		}

		return false;
	}

}
