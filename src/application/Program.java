package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Individual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Individual[]vect1 = new Individual[n];
		double sum = 0;
		int smaller16 = 0;
		
		for (int i =0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sum += height;
			vect1[i]= new Individual(name, age, height);
			
			if (vect1[i].getAge()<16) {
				smaller16 ++;
			}
			
		}
		
		double media = sum/n;
		// A linha a seguir tinha um bug. Ela realizava uma divisão de inteiros e armazenava o resultado em uma variável int.
		// Criei uma variável 'double' para a porcentagem para garantir o cálculo correto de ponto flutuante.
		double percentage = (double) smaller16 * 100.0 / n;
		
		System.out.printf("\nAltura média: %.2f%n", media);
		// A linha a seguir tentava imprimir um inteiro com um especificador de formato float (%.2f).
		// Agora está corrigido para usar a variável 'percentage'. Também mudei para uma casa decimal (%.1f).
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentage);
		
		// O loop abaixo estava causando um NullPointerException porque tentava acessar elementos
		// em um array que não estava totalmente preenchido ('vect2').
		// Este loop corrigido itera pelos dados originais e imprime os nomes das pessoas com menos de 16 anos.
		for (int i=0;i<n;i++) {
			if (vect1[i].getAge() < 16) {
				System.out.println(vect1[i].getName());
			}
		}
		
		
		sc.close();
	}

}

