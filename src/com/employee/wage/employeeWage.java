package com.employee.wage;

import java.util.Random;

public class employeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation .");

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;

		Random random = new Random();
		int randomNum = random.nextInt(3);

		if (randomNum == 1) {
			System.out.println("Employee is Present");
			salary = wagePerHour * fullDayHours;
		} 
		else if (randomNum == 2) {
			System.out.println("Employee is Present for Halfday");

			salary = wagePerHour * halfDayHours;
		}
		else

			System.out.println("Employee is Absent");
		System.out.println("Employee salary is : " + salary);

	}

}
