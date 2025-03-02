package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

/*Problema "troco" 
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, 
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve 
mostrar o valor do troco a ser devolvido ao cliente.  */

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
			double valorUnitario = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
			int qtde = sc.nextInt();
		
		System.out.print("Dinheiro Recebido: ");
			double dinheiroRecebido = sc.nextDouble();
			
			double valorCompra = (valorUnitario * qtde);
			
			double troco = dinheiroRecebido - valorCompra;
			System.out.printf("Troco = %.2f%n", troco);

		
		sc.close();

	}

}
