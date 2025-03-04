/* Problema "menor_de_tres" 
Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três 
números lidos. Em caso de empate, mostrar apenas uma vez. */

package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US); // Representa uma configuração regional, como idioma e formato de moeda, número e data
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Primeiro valor: ");
				int a = sc.nextInt();
			
			System.out.print("Segundo valor: ");
				int b = sc.nextInt();
				
			System.out.print("Terceiro valor: ");
				int c = sc.nextInt();
				
			if(a-b <=0 && a-c <=0) {
				System.out.print("MENOR = " + a);
			} else if (b - a < 0 && b - c <= 0){
				System.out.print("MENOR = " + b);
			} else {
				System.out.print("MENOR = " + c);
			}
			
			
			
			sc.close();
		}

	}
		