package com.employee.wage;

import java.util.Random;

public class employeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation .");

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		int monthlySalary = 0;
		int workingDaysPerMonth = 20;
		int workingHoursperMonth = 0;
		int days = 1;

		Random random = new Random();
		int randomNum = random.nextInt(3);

		while (days != 20 && workingHoursperMonth != 100) {
			switch (randomNum) {
			case 0:
				System.out.println("Employee is Absent");
				break;

			case 1:
				System.out.println("Employee is Present");
				salary = wagePerHour * fullDayHours;
				workingHoursperMonth = workingHoursperMonth + fullDayHours;
				break;

			case 2:
				System.out.println("Employee is Present for Halfday");
				salary = wagePerHour * halfDayHours;
				workingHoursperMonth = workingHoursperMonth + halfDayHours;
				break;
			}
			monthlySalary = monthlySalary + salary;
			System.out.println("day " + days + " salary is : " + salary);
			days++;
		}

		System.out.print("Employees monthly salary is : " + monthlySalary);

	}

}
