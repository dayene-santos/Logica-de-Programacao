/*  
Problema "soma_impares" (adaptado de URI 1071) 
Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números 
impares entre eles.*/ 

package estruturaRepetitiva;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x, y, soma, troca;
		
		System.out.println("Digite dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
		
		if(x >y) {
			troca = x;
			x = y;
			y = troca;
		}
			
			soma = 0;
		for(int i =x+1; i<y; i++) {
			if(i % 2 != 0) {
				soma = soma +i;
			}
		}
		
		System.out.printf("SOMA DOS IMPARES = %d\n", soma);
		
		sc.close();

	}

}
