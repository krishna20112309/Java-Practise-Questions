package Arrays_Question_With_Solution;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
//		Create a Array of 5 Floats and calculate their sum.
		
		System.out.println("Solved By Krishna Jaiswal");
		Scanner sc=new Scanner(System.in);
		int n=5;
		float arr[]=new float[]{5.2f,3.8f,10.2f,2.0f,30.5f};
		
		float sum=0;
           for(int i=0;i<n;i++) {
        	   sum=sum+arr[i];
           }
        System.out.println("Sum of 5 Float Valuse is "+sum);
	}

}
