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
		Individual[]vect2 = new Individual[n];
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
				vect2[i] = new Individual(name);
			}
			
		}
		
		double media = sum/n;
		smaller16 = (smaller16 * 100)/n;
		
		System.out.printf("\nAltura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f %% %n", smaller16);
		for (int i=0;i<n;i++) {
			System.out.println(vect2[i].getName());
		}
		
		
		sc.close();
	}

}
