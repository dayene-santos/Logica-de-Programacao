/* Problema "multiplos" (adaptado de URI 1044) 
Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os 
números podem ser digitados em qualquer ordem. */

package estruturaCondicional;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
		if (a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		
				
		
		sc.close();
		
	
	}

}
