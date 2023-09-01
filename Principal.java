package ModuloDezComportamentoMemoriaArraysListaVetoresProblemaAlturas;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Pessoas pessoa[] = new Pessoas[n];

		for (int i = 0; i < n; i++) {

			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			pessoa[i] = new Pessoas(nome, idade, altura);
		}

		double media = 0;
		for (int i = 0; i < n; i++) {
			media += pessoa[i].getAltura() / n;
			
		}
		System.out.printf("Altura média: %.2f", media);
		
		double menor = 0;
		double totalMenor = 0;
		for (int i = 0; i < n; i++) {
			if(pessoa[i].getIdade() < 16) {
				menor++;
				totalMenor = menor / n *100.0;
			}
			
			
			
		}
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", totalMenor );
		
		
		for (int i = 0; i < n; i++) {
			if(pessoa[i].getIdade() < 16) {
				
				
				System.out.printf("%s\n", pessoa[i].getNome());
			}
		}
			
		

		sc.close();
	}

}
