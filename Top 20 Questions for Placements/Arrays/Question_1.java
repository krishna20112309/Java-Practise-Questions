package Arrays_Question_With_Solution;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
//		 Write a Java program to reverse an array.
		
	System.out.println("Solved By Krishna Jaiswal");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of a Array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the Arrays of length "+ n);
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Reversed Array is ");
	for(int j=0;j<=n-1;j++) {
		System.out.print(arr[n-j-1]+"  ");
	}
	}

}
