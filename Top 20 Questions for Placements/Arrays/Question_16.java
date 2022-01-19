package Arrays_Question_With_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
//		Write a java program to count occurrence of each element in an array.
		
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
		int fr[]=new int[n];
		int visited=-1;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
			
		}
		System.out.println(" Elements | Frequency ");
		for( int i=0;i<fr.length;i++) {
			if(fr[i]!=visited) {
				System.out.println("  "+arr[i]+ "  |  "+ fr[i]);
			}
		}
	}

}
