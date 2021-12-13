package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
	
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (i + 1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char check = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double vph = sc.nextDouble(); 
			if (check == 'y') {
				System.out.print("Additional charge: ");
				double add = sc.nextDouble();
				employees.add(new OutSourcedEmployee(name, hours, vph, add));
			} else if (check == 'n') {
				employees.add(new Employee(name, hours, vph));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee x : employees) {
			System.out.println(x);
		}			
			
			sc.close();
			 		
	}			

}


