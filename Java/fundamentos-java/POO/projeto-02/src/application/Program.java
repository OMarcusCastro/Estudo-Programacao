

package application;

import entities.Employee;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


import java.util.Scanner;

public class Program {



	public static void main(String[] args) {

		List<Employee> list=new ArrayList<>();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registred? ");

		int n = sc.nextInt();

		for(int i=0;i<n;i++){
			System.out.println();
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("Id: ");
			Integer id =sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee employee = new Employee(id,name,salary);
			list.add(employee);

		}

		System.out.print("Enter id to increase");
		Integer id = sc.nextInt();
		Employee emp= list.stream().filter(employee -> employee.getId()==id).findFirst().orElse(null);

		if(emp ==null){
			System.out.print("this id does not exist!");
		}else{
			System.out.print("Enter percentage");
			Double percentage = sc.nextDouble();

			emp.increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List employees:");
		for(Employee employee:list){
			System.out.println(employee);
		}

		sc.close();

	}




}
