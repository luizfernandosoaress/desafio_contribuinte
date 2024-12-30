package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.printf("Digite os dados do %do contribuinte:%n", i+1);
			System.out.print("Renda anual com salário: ");
			Double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			Double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			Double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			Double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			Double educationSpending = sc.nextDouble();
			
			TaxPayer payer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			list.add(payer);
			
		}
		
		int index = 1;
		for(TaxPayer payer : list) {
				System.out.println();
				System.out.printf("Resumo do %do contribuinte:%n", index);
				System.out.println(payer);
				index++;
		}
		
		
		
		
		sc.close();

	}

}
