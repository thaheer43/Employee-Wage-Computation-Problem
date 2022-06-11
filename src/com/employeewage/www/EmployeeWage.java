package com.employeewage.www;

import java.util.Random;

public class EmployeeWage {
	static final int fullDayHours = 8;
	static final int partTimeHours = 4;

	public static void main(String[] args) {
		System.out.println(" Welcome to Employee Wage Computation Program ");

		empWage("CES", 15, 6, 104);
		empWage("TCS", 15, 10, 104);
	}

	public static void empWage(String companyName, int wagePerHour, int maxWorkingDays, int maximumHrsPerMnth) {
		int wagePerDay = 0;
		int day = 0;
		int monthlyHours = 0;
		int monthlySalary = 0;
		System.out.println("Stats of employee working in " + companyName + " company are:");
		while (monthlyHours != maximumHrsPerMnth && day != maxWorkingDays) {
			day++;
			Random random = new Random();
			int attendance = random.nextInt(3);
			switch (attendance) {
			case 0:
				System.out.println("Employee is absent");
				break;
			case 1:
				System.out.println("Employee  is present");
				wagePerDay = fullDayHours * wagePerHour;
				monthlyHours = monthlyHours + fullDayHours;
				System.out.println("Employee's daily wage is:" + wagePerDay);
				break;
			case 2:
				System.out.println("Employee is present for part time");
				wagePerDay = partTimeHours * wagePerHour;
				monthlyHours = monthlyHours + partTimeHours;
				System.out.println("Employee's daily wage is:" + wagePerDay);
				break;

			}
			monthlySalary = monthlySalary + wagePerDay;
			System.out.println(
					" Day is: " + day + " monthlyHours: " + monthlyHours + " Monthly Salary is: " + monthlySalary);
		}
	}
}