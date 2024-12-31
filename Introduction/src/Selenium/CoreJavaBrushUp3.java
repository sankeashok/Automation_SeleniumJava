package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
	
				//Strings
		String a = "Luxoft";
		String a1 = "Luxoft";
		
		//new
		String a3 = new String ("Luxoft DXC Technology Company");
		String a4 = new String ("Luxoft DXC Technology Company");
		String[] splittedString = a4.split(" ");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		//to print every character of string
//		for (int i=0; i<a4.length(); i++)
//		{
//			System.out.println(a4.charAt(i)) ;
//		}
//		
//		
		//to print every character of string in reverse order
		
		for (int i=a3.length()-1; i>=0; i--)
		{
			System.out.println(a3.charAt(i)) ;
		}
		
		
		
		}
}