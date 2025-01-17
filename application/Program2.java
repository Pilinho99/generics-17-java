package genSetMap_17.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import genSetMap_17.services.CalculationService;

public class Program2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		String path = "C:\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				list.add(Integer.parseInt(line));
				line = br.readLine();
			}
			
			Integer x = CalculationService.max(list);
			System.out.println("Max:");;
			System.out.println(x);
		
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
