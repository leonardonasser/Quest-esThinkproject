package exercicio5;

import java.util.Scanner;

/*6) Ler dois vetores A e B, com 6 elementos cada. Construir uma matriz C de duas dimensões,
 *  onde a primeira coluna deverá ser formada pelos elementos da matriz A e a segunda coluna
 *   deverá ser formada pelos elementos da matriz B.
 */

public class Exercicio5VetorEMatriz{
	
	public static void main(String[] args) {
		int vetorA[] =  new int[6];
		int vetorB[] =  new int[6];
		int matrizC[][] = new int[6][2];
		
	
		inserirDados(vetorA,vetorB);
		passarVetoresAMatriz(vetorA,vetorB,matrizC);
		apresentarDadosMatriz(matrizC);
	
	}
	
	public static void inserirDados(int vetorA[], int vetorB[]) {
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o "+(i+1)+"ºnumero do vetor A: ");
			vetorA[i] = ler.nextInt();
	}
		System.out.println("\n");
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o "+(i+1)+"ºnumero do vetor B: ");
			vetorB[i] = ler.nextInt();
		}
		
  }
	
	public static void passarVetoresAMatriz(int vetorA[], int vetorB[], int matrizC[][]) {
		for (int i = 0; i < 6; i++) {
			matrizC[i][0] = vetorA[i];
		}
		for (int i = 0; i < 6; i++) {
			matrizC[i][1] = vetorB[i];
		}
		
		
	}
	
	public static void apresentarDadosMatriz(int matrizC[][]) {
		System.out.println("VetorA | VetorB");
		for (int i = 0; i < 6; i++) {
			System.out.println("  "+matrizC[i][0]+"        "+matrizC[i][1]);
		}
	}
	
	
}