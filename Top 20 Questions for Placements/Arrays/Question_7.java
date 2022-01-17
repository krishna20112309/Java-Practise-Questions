package Arrays_Question_With_Solution;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
//		Calculate the average marks from an array containing marks of all student in physics using a for-each loop.
		System.out.println("Solved By Krishna Jaiswal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Marks of  "+ n+" Student in Physics ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		double average=sum/n;
		System.out.println("Average marks of Students in physics is "+average);
	}

}
