/* Problema "dardo" 
No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir. 
Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual 
foi a maior. */ 

package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US); // Representa uma configuração regional, como idioma e formato de moeda, número e data
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite as tres distancias: ");	
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
			
		
				if(a >=b && a>=c ) {
					System.out.printf("MAIOR DISTANCIA = %.2f%n", a);
				} else if (b >= a && b >= c){
					System.out.printf("MAIOR DISTANCIA = %.2f%n ", b);
				} else {
					System.out.printf("MAIOR DISTANCIA = %.2f%n", c);
				}			
				
				
					sc.close();
	}

}