package Arrays_Question_With_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
//		Write a java program to find second largest element in an array of Integers.
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
		Arrays.sort(arr);
		System.out.println("Second Lasgest Element of Given Array is ");
         System.out.println(arr[n-2]);
	}

}
