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

		switch (randomNum) 
		{
		case 0:
			System.out.println("Employee is Absent");
			break;
			
		case 1:
			System.out.println("Employee is Present");
			salary = wagePerHour * fullDayHours;
			break;

		case 2:
			System.out.println("Employee is Present for Halfday");
			salary = wagePerHour * halfDayHours;
			break;
		}

		System.out.println("Employee salary is : " + salary);

	}

}
