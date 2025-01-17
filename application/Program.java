package genSetMap_17.application;

import java.util.Scanner;

import genSetMap_17.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String value = sc.nextLine();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}

}
