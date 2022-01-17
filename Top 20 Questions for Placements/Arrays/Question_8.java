package Arrays_Question_With_Solution;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
//		Create a java program to add two matrices of size 2x3.
		System.out.println("Solved By Krishna Jaiswal ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows Size of the Matrix ");
		int n=sc.nextInt();
		System.out.println("Enter the Columns Size of the Matrix ");
		int m=sc.nextInt();
		
		int arr1[][]=new int[n][m];
		int arr2[][]=new int[n][m];
		int sum[][]=new int[n][m];
		System.out.println("Enter the elements of first Matrix ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			arr1[i][j]=sc.nextInt();
		}
	}
		System.out.println("Enter the elements of Second Matrix ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			arr2[i][j]=sc.nextInt();
		}
	}
		System.out.println("Addition of Two Matrix of size "+n+"x"+m+" is :- ");
		for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                
                System.out.print(sum[i][j] + "   ");
            }
            System.out.println();
        }
		
		
		
		}
}
