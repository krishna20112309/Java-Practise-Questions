package Arrays_Question_With_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		// Write a java Program to find the intersection of two arrays.
		System.out.println("Solved By Krishna Jaiswal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a First Arrays");
		int n=sc.nextInt();
		System.out.println("Enter the length of a Second Arrays");
		int m=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		System.out.println("Enter the Elements of First Array whose Length is  "+ n);
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("The Arrays Created is "+Arrays.toString(arr1));
		System.out.println("Enter the Elements of Second Array whose Length is  "+ m);
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("The Arrays Created is "+Arrays.toString(arr2));
		System.out.println("Intersection of Two Arrays are ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}

	}

}
