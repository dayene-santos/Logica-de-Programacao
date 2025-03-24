/* Problema "negativos" - Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

package vetores;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos números você vai digitar? ");
			n = sc.nextInt();
			
			int[] vetor = new int[n];
			
			for(int i = 0; i<n; i++) {
				System.out.print("Digite um número: ");
					vetor [i] = sc.nextInt();
			}
			
			System.out.println("Números negativos: ");
				for(int i = 0; i<n; i++) {
					if(vetor[i]<0) {
						System.out.printf("%d\n",vetor[i]);
					}
				}
		
		sc.close();

	}

}
