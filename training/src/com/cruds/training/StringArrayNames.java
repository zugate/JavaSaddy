package com.cruds.training;

import java.util.*;

public class StringArrayNames {
	
	public static void main(String...asd) {
		String names[]=new String[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<names.length;i++) {
			System.out.println("Please enter a name: ");
			names[i]=sc.nextLine();
		}
		String searchName="";
		System.out.println("Please enter a name to search");
		searchName=sc.nextLine();
		do {
				
				boolean found=false;
				for(int i=0;i<names.length;i++)
				{
					if(searchName.equals(names[i])) {
						found=true;
						System.out.println("Found");
						break;
					}
				}
				if(!found)
				{
					System.out.println("Not Found");
				}
				
				System.out.println("Please enter a name to search");
				searchName=sc.nextLine();
				
		}while(!(searchName.equalsIgnoreCase("Exit")));
		
		sc.close();
	}
	

}
