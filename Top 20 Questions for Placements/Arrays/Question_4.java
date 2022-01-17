package Arrays_Question_With_Solution;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
//		Write a program to find whether an array is sorted or not.
		System.out.println("Solved By Krishna Jaiswal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Arrays of length "+ n);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		if(n==1) {
			System.out.println("Arrays is Sorted");
		}else {	
		      for(int i=0;i<n-1;i++) {
			          if(arr[i]<arr[i+1]) {
				          sum=sum+0;	
		                  }else {
		    	            sum=sum+1;
		                     }
		         }
		      if(sum==0) {
					System.out.println("Arrays is sorted ");
				}else
				 {
					System.out.println("Arrays is not Sorted");
				}
	          }
		
	}
	}
