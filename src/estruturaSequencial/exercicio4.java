package estruturaSequencial;
import java.util.Scanner;

//Problema "soma" 
/*Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes 
 *números. */

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
			int x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");	
			int y = sc.nextInt();
		
		int soma = x + y;
		System.out.println("SOMA = " + soma);
		
		sc.close();
	
		
	}

}
