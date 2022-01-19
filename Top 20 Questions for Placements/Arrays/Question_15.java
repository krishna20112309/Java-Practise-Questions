package Arrays_Question_With_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Question_15 {
	public static int  missingNumber(int[] arr) {
		int n=arr.length;
		int a=n+1;
		int sum=a*(a+1)/2;
		int restSum=0;
		for(int i=0;i<n;i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		return missingNumber;
		
	}

	public static void main(String[] args) {
//		Java program to find missing number in an array
		
		System.out.println("Solved By Krishna Jaiswal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Arrays of length "+ n);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Arrays Created is "+Arrays.toString(arr));
		System.out.println("Missing number from the Given arrays is "+ missingNumber(arr));
	}

}
