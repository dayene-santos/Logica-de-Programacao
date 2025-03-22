/*Problema "media_ponderada" (adaptado de URI 1079) 
Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de 
teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo 
que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar 
que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida 
pela soma dos pesos.*/

package estruturaRepetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double num1, num2, num3, media;
		
		System.out.print("Quantos casos você vai digitar? ");
			n = sc.nextInt();
			
		for(int i=0; i<n; i++) {
			System.out.println("Digite três números: ");
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				num3 = sc.nextDouble();
				
				media = ((num1 * 2) + (num2 *3) + (num3 * 5)) / 10;
		
				System.out.printf("MEDIA = %.1f%n", media);
		}
			
		
		sc.close();
	}

}
