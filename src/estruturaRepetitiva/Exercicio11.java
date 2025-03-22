/* Problema "dentro_fora" (adaptado de URI 1072) 
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
conforme exemplo*/

package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, x, dentro = 0, fora = 0 ;
		
		System.out.print("Quantos números você vai digitar? ");
			N = sc.nextInt();
			
			for(int i=0; i < N; i++) {
				System.out.print("Digite um número: ");
					x = sc.nextInt();
					
						if(x >= 10 && x <= 20) {
							dentro++;
						} else {
							fora++;
						}
				
			}
			
			System.out.printf("%d DENTRO %n", dentro);
			System.out.printf("%d FORA %n", fora);	
		
		
		sc.close();

	}

}
