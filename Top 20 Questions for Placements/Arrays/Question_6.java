package Arrays_Question_With_Solution;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
//		Write a program to find whether a given integer is present in array or not.
		System.out.println("Solved By Krishna Jaiswal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Arrays of length "+ n);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the given integer Value ");
        int a=sc.nextInt();
        int temp=0;
        for(int i=0;i<n;i++) {
        	if(a==arr[i]) {
        		temp=temp+1;
        	}else {
        		temp=temp+0;
        	}
        }
        if(temp==1) {
               System.out.println(a+" is Present "+temp+" times in the Given Arrays");
	        }else if(temp==0){
	        	System.out.println(a+" is not present in the Given Arrays");
	        }else {
	        	System.out.println(a+" is Present "+temp+" times in the Given Arrays");
	        }

}
	}

