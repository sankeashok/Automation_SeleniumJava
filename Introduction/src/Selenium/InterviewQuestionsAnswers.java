package Selenium;

import java.util.Scanner;

public class InterviewQuestionsAnswers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Multiplication of a given number
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enete number of your choice: ");
		
		int num = scanner.nextInt();
		scanner.close();
		
		for (int i=1; i<=10; i++) {
			System.out.println( num + "x" + i + "=" + (i*num));
	
		}

	}

}
