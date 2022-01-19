package Arrays_Question_With_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		// Write a java program to find continuous subarray whose sum is equal to a given number.
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
		
		System.out.println("Enter the Required Number");
		int a= sc.nextInt();
		System.out.println("SubArrays whose sum is "+ a);
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
			     sum+=arr[j];
			      if(sum==a) {
				System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
			}
		}
	}
	}

}
