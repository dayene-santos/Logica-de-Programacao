/* Problema "troco_verificado" 
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, 
e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido 
ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o 
valor restante conforme exemplo. */

package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;


public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Representa uma configuração regional, como idioma e formato de moeda, número e data
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
			double precoUnitario = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
			int qtde = sc.nextInt();
		
		System.out.print("Dinheiro Recebido: ");
			double valorRecebido = sc.nextDouble();
			
			double valorCompra = (qtde * precoUnitario); 
			double troco =  valorRecebido - valorCompra;
			
		if (valorRecebido < valorCompra) {
				double diferenca =  valorCompra - valorRecebido;
				System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", diferenca);
		} else {			
			System.out.printf("TROCO = %.2f%n", troco);
		}
				
		
		
		sc.close();
	}

}
