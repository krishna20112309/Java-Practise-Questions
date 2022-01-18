package Arrays_Question_With_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
//		Write a java program to find the maximum consecutive one's(or zero's) in a Binary array.
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
		int count=0,maxvalue=0,minvalue=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				count++;
				maxvalue=Math.max(maxvalue, count);
			}else {
				count=0;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
				minvalue=Math.max(minvalue, count);
			}else {
				count=0;
			}
		}
		System.out.println("Maximum Consecutive 1's is ");
		System.out.println(maxvalue);
		System.out.println("Maximum Consecutive 0's is ");
		System.out.println(minvalue);
		
	}

}
