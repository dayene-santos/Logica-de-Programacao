package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

/* Problema "duracao" 
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no 
formato horas:minutos:segundos.*/ 

public class exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a duração em segundos: ");
        int duracao = sc.nextInt();

        
        int horas = duracao / 3600; //1 hora = 3600 segundos
        int minutos = (duracao % 3600) / 60; //   1 minuto = 60 segundos
        int segundos = duracao % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);		
		
		sc.close();
	}

}
