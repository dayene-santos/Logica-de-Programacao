/*  Problema "aumento" (adaptado de URI 1048) 
Uma empresa vai conceder um aumento percentual de 
salário aos seus funcionários dependendo de quanto 
cada pessoa ganha, conforme tabela ao lado. Fazer um 
programa para ler o salário de uma pessoa, daí mostrar 
qual o novo salário desta pessoa depois do aumento, 
quanto foi o aumento e qual foi a porcentagem de 
aumento. */

package estruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double porcentagem = 0;
		double aumento =0;
		double novoSalario = 0;
		
		System.out.print("Digite o salario da pessoa: ");
			double salario = sc.nextDouble();
			
		if (salario <= 1000.00) {
			porcentagem = 20;
			aumento = salario * (porcentagem/100);
			novoSalario = salario + aumento;
			System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);
			System.out.printf("Aumento: R$ %.2f%n", aumento);
			System.out.printf("Porcentagem:  %.0f%%\n", porcentagem);
			
		} else if (salario > 1000.00 && salario < 3000.00) {
			porcentagem = 15;
			aumento = salario * (porcentagem/100);
			novoSalario = salario + aumento;
			System.out.printf("Novo Salário: R$  %.2f%n", novoSalario);
			System.out.printf("Aumento: R$ %.2f%n", aumento);
			System.out.printf("Porcentagem: %.0f%%\n", porcentagem);
			
		} else if (salario > 3000.00 && salario <= 8000.00 ) {
			porcentagem = 10;
			aumento = salario * (porcentagem/100);
			novoSalario = salario + aumento;
			System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);
			System.out.printf("Aumento: R$ %.2f%n", aumento);
			System.out.printf("Porcentagem: %.0f%%\n", porcentagem);
		} else {
			porcentagem = 5;
			aumento = salario * (porcentagem/100);
			novoSalario = salario + aumento;
			System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);
			System.out.printf("Aumento: R$ %.2f%n", aumento);
			System.out.printf("Porcentagem: %.0f%%\n", porcentagem);		
		}	
		
		
		sc.close();

	}

}
