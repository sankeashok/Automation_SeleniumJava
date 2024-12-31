package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {


		int[] arr2 = {2, 5, 6, 7, 9, 8, 12, 30, 122};
		
		//retrieving numbers only multiples of 2 or divided by 2
		for (int i = 0; i<arr2.length; i++)
		{

			
			if (arr2[i] % 2 == 0)			//if (arr2[i] % 2 != 0) for retrieving odd numbers
			{
				System.out.println(arr2[i]);
				break;
			}
			
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2" );
			}
		}
		
//		ArrayList
		List<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		
		System.out.println("Retrieving single value from arraylist using get :" + a.get(3));
		
		//Enhanced for loop on Arraylist for printing values
		for (String val :a)
		{
			System.out.println("Retrieving single value from arraylist using for loop :" + val);
		}
		
//		to check if array contains a specific keyword ex: Selenium
		System.out.println(a.contains("Selenium"));
		
		String[] name = {"A", "B", "C", "D"};
		List <String> namesArrayList = Arrays.asList(name);
		System.out.println(namesArrayList.contains("Rahul")) ; //this will retrieve false as this list doesn't contain Rahul.
		
		
		
		
		
		
		
		}
}