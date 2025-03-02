package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;


/* Problema "pagamento" 
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a 
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com 
uma mensagem explicativa, conforme exemplo.*/ 


public class excercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
			String nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			
		System.out.print("Horas trabalhadas: ");
			double horasTrabalhadas = sc.nextDouble();
		
		double pgto = horasTrabalhadas * valorHora;
		
		System.out.printf("O pagamento para %s deve ser %.2f%n", nome, pgto);
		
				
		sc.close();
	}

}
