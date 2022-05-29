package com.employeewage.www;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println(" Welcome to Employee Wage Computation Program ");
		
		Random random = new Random();
		int attendance = random.nextInt(2);
		if (attendance == 1)

			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

}