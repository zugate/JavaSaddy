package com.cruds.training;

import java.util.Scanner;
public class ArrayDemo {
	
	public static void main(String...asd) {
		
		int[] nums=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<nums.length;i++) {
			System.out.println("Please enter a number");
			nums[i]=sc.nextInt();
		}
		System.out.println("Please enter a number to search");
		int i;
		int search=sc.nextInt();
		do {
			for(i=0;i<nums.length;i++) {
				if(nums[i]==search) {
					System.out.println("Number is there! at position "+(i+1));
					break;
				}
			}
			if(i==nums.length)
			{
				System.out.println("Number not found");
			}
			System.out.println("Please enter a number to search");
			search=sc.nextInt();
		}while(search!=-1);
		sc.close();
	}

}
