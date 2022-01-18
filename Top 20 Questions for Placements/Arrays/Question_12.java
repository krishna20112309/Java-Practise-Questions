package Arrays_Question_With_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
//		Write a java program to find all the pairs of elements in an integer array whose sum is equal to given number.

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
		System.out.println("Enter the Given Number whose sum is required");
		int a=sc.nextInt();
		int sum=0;
		System.out.println("Pairs of Elements of Arrays whose sum is  "+ a);
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]+arr[j]==a && i!=j) {
					System.out.println(arr[i]+ " ,"+ arr[j]);
				}
			}
	}
	}
}
