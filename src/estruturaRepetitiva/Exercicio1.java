package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
			int x = sc.nextInt();
			int y = sc.nextInt();

		if(x < y) {
			System.out.println("CRESCENTE !");
		} else {
			System.out.println("DECRESCENTE !");
		}
		
		while(x != y) {
			System.out.println("Digite outros dois números: ");
				 x = sc.nextInt();
				 y = sc.nextInt();
		 if(x < y) {
				System.out.println("CRESCENTE !");
		} else {
				System.out.println("DECRESCENTE !");
		}
			
		}
			
			
			
			
			
	sc.close();
	}

}
