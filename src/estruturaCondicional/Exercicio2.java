/* Problema "baskara" 
Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula 
de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais, 
conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.*/

package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Coeficiente a: ");
				double a = sc.nextDouble();
			
			System.out.print("Coeficiente b: ");
				double b = sc.nextDouble();
				
			System.out.print("Coeficiente c: ");
				double c = sc.nextDouble();
				
			double delta = (b * b) - 4 * a * c;
			
			if(delta >= 0) {
				double x1 = (- b + Math.sqrt(delta))/ (2 * a);
				double x2 = (- b - Math.sqrt(delta))/ (2 * a);
				System.out.printf("X1 = %.4f%n", x1);
				System.out.printf("X1 = %.4f%n", x2);
			} else  {
				System.out.println("Esta equacao nao possui raizes reais");
			}			
			
			sc.close();
	}

}







