package Arrays_Question_With_Solution;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
//		Write a Java program to find the minimum and Maximum element in an array.
		System.out.println("Solved By Krishna Jaiswal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Arrays of length "+ n);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxNo=0;
		int minNo=arr[0];
		for(int i=0;i<n-1;i++) {
			if(arr[i]>maxNo) {
				maxNo=arr[i];
			}else {
				maxNo=maxNo;
			}
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i]<minNo) {
				minNo=arr[i];
			}else {
				minNo=minNo;
			}
		}
		System.out.println("The Maximum element of the Given array is ");
            System.out.println(maxNo);
            System.out.println("The Minimum element of the Given array is ");
            System.out.println(minNo); 

	}

}
