/*  
Problema "tabuada"   
Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.*/

package estruturaRepetitiva;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, produto;

		System.out.print("Deseja a tabuada para qual valor? ");
	    n = sc.nextInt();

	    for (int i=1;i<=10;i++) {
	        produto = n * i;
			System.out.printf("%d x %d = %d\n", n, i, produto);
	    }

		sc.close();
	}
}

