package Selenium;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		System.out.print("retrieving the integer type variable here : " + myNum);
		char letter = 'r';
		double decimal = 5.99;
//		float decimal2 = 4.06;
		boolean myCard = true;
		
		//Arrays - first method of defining array
		int[] arr = new int[6];
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 9;
		arr[3] = 3;
		arr[4] = 7;
		arr[5] = 2;
		
		//Arrays - second method of defining array
		int[] arr2 = {2,5,6,7,9};
		System.out.println(arr2[3]);
		
		
		//For loop
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println("Retrieving array2 values using for loop " + "\n" + arr[i]);
			
		}
		
		
		String[] arr3 = {"A", "B", "C", "D"};
		System.out.println(arr2[3]);
		
		
		//For loop
		for (int i = 0; i<arr3.length; i++)
		{
			System.out.println("Retrieving String array3 values using for loop " + "\n" + arr3[i]);
			
		}
		
//		Enhance for loop
		
		for (String s : arr3) {
			
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
