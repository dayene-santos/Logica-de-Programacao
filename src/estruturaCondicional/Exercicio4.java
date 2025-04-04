/* Problema "operadora" 
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de 
telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para 
ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.*/


package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Representa uma configuração regional, como idioma e formato de moeda, número e data
		Scanner sc = new Scanner(System.in);
			
			double planoBasico = 50.00;
			double valorAPagar = planoBasico;
			
		System.out.print("Digite a quantidade de minutos: ");
			int minutos = sc.nextInt();
			
		if(minutos > 100) {
			int minutosMais = minutos - 100;
			valorAPagar += minutosMais *2;
			} 
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
		
		sc.close();
	}

}

