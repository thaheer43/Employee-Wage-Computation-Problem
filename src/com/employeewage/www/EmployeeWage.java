package com.employeewage.www;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println(" Welcome to Employee Wage Computation Program ");
		Random random = new Random();
		int attendance = random.nextInt(2);
		int wagePerHour = 20;
		int fullDayHours = 8;
		int wagePerDay = 0;

		if (attendance == 1) {
			System.out.println("Employee is present");
			wagePerDay = fullDayHours * wagePerHour;
			System.out.println("Employee's daily wage is:" + wagePerDay);
		} else
			System.out.println("Employee is absent");

	}

}