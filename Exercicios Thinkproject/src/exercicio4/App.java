package exercicio4;

import java.util.Scanner;

/*4) Faça um programa que leia uma frase e uma palavra. Pesquise a palavra dentro
 *  da frase e informe: ‘Palavra encontrada’ ou ‘Palavra não encontrada’.
 */

public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String frase;
		String palavra;

		System.out.println("Digite uma frase: ");
		frase = ler.nextLine();

		System.out.println("\nDigite a palavra que deseja ser encontrada: ");
		palavra = ler.nextLine();

		boolean resultado = Metodos.ProcurarPalavra(frase, palavra);

		if (resultado == true) {
			System.out.println("\nPalavra encontrada");
		} else {
			System.out.println("\nPalavra não encontrada");
		}

	}

}
