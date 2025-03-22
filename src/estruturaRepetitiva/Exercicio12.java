/*  
Problema "par_impar" (adaptado de URI 1074) 
Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida. 
Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também 
se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir 
apenas NULO. */

package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, x=0;
		
		System.out.print("Quantos números você vai digitar? ");
			N = sc.nextInt();
				
		
			for(int i=0; i<N; i++) {
				
				System.out.print("Digite um número: ");
				x = sc.nextInt();
			
				if(x > 0 && x % 2 == 0) {
					System.out.println("PAR POSITIVO");
				} else if (x > 0 && x % 2 != 0) {
					System.out.println("IMPAR POSITIVO");
				} else if (x < 0 && x % 2 == 0) {
					System.out.println("PAR NEGATIVO");					
				} else if (x < 0 && x % 2 != 0) {
					System.out.println("IMPAR NEGATIVO");
				} else {
					System.out.println("NULO");
				}
		}
		
		
		sc.close();

	}

}
