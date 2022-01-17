package Arrays_Question_With_Solution;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Arrays of length "+ n);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Dublicate Elements are ");
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]==arr[j]) {
        			System.out.println(arr[j]);
        		}
        	}
        }
	}

}
