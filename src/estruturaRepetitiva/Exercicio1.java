/* Problema "crescente" (adaptado de URI 1113)  
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma 
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O 
programa deve finalizar quando forem digitados dois valores iguais.*/

package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
			int x = sc.nextInt();
			int y = sc.nextInt();

		
			while(x != y) {
				if(x < y) {
					System.out.println("CRESCENTE !");
				} else {
					System.out.println("DECRESCENTE !");
				}
			
				System.out.println("Digite outros dois números: ");
					 x = sc.nextInt();
				 y = sc.nextInt();
			 
		}
			
			
	sc.close();
	}

}
