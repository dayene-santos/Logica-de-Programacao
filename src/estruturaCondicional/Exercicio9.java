/* Problema "lanchonete" (adaptado de URI 1038) 
Uma lanchonete possui vários produtos. Cada produto possui um código 
e um preço. Você deve fazer um programa para ler o código e a 
quantidade comprada de um produto (suponha um código válido), e daí 
informar qual o valor a ser pago, com duas casas decimais, conforme 
tabela de produtos ao lado.*/

package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Representa uma configuração regional, como idioma e formato de moeda, número e data
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Codigo do produto comprado: ");
			int codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
			int qtde = sc.nextInt();
		
		switch (codigo) {			
		case 1:
			double valorAPagar = qtde * 5.00;
			System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
			break;
		case 2:
			 valorAPagar = qtde * 3.50;
			System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
			break;
		case 3:
			 valorAPagar = qtde * 4.80;
			System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
			break;
		case 4:
			 valorAPagar = qtde * 8.90;
			System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
			break;
		case 5:
			 valorAPagar = qtde * 7.32;
			System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
			break;
		default:
				System.out.println("Código Inválido!");
		}
		
		sc.close();
	}

}
