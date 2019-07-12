package com.cruds.assignment;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.cruds.exception.StudentException;
import com.cruds.training.Student;

public class TestStudentFileDirectory {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				Student[] s=new Student[25];
				int tempRoll;
				String tempName;
				
				
				boolean choice2=false;
				do{
					System.out.println("Choose the following options\n"
							+ "1. Add Students ( Max. 25)\n"
							+ "2. Search Students by roll number\n"
							+ "3. Search Students by Name\n"
							+ "4. Delete Student\n"
							+ "5. List all students\n"
							+ "6. exit");
					int choice=sc.nextInt();
					sc.nextLine();
					//System.out.println(s[0].getRollNo());
						switch(choice)
						{
						case 1: System.out.println("Enter the Name. of the student");
						tempName=sc.nextLine();
						System.out.println("Enter the roll no of the student");
						tempRoll=sc.nextInt();
						try {
						s[Student.count++]=new Student(tempRoll, tempName);
						System.out.println();
						}
						catch(StudentException se) {
							se.printStackTrace();
						}
						break;
				case 2: System.out.println("Enter the Roll no. of the Student you want to search");
						int temp=sc.nextInt();
						int itr=0;boolean found=false;
						while(itr<Student.count)
						{
							if(s[itr].getRollNo()==temp)
								{found=true;break;}
							itr++;
						}
						if(found)
						{
							System.out.println("Student Found !! with name "+s[itr].getName());
						}
						else
							System.out.println("Not Found!");
						System.out.println();
						break;
				case 3: System.out.println("Enter the name of the Student you want to search");
						String st=sc.nextLine();
						int itr2=0;boolean found2=false;
						while(itr2<Student.count)
						{
							if(s[itr2].getName().equalsIgnoreCase(st))
								{found2=true;break;}
							itr2++;
						}
						if(found2)
						{
							System.out.println("Student Found !! with Roll no. "+s[itr2].getRollNo());
						}
						else
							System.out.println("Not Found!");
						System.out.println();
						break;
				case 4 :
						System.out.println("Enter the name to delete : ");
						String st1 = sc.nextLine();
						for(int i=0;i<Student.count;i++) {
							if(st1.equals(s[i].getName())) {
								s[i] = null;
							}
						}
						break;
				case 5: System.out.println("Listing all the students");
						int itr3=0;
						while(itr3<Student.count) {
							if(s[itr3] == null) {
								continue;
							}
							System.out.println("Student "+(itr3+1)+" Roll no. :"+s[itr3].getRollNo());
							System.out.println("          Name     :"+s[itr3].getName());
							System.out.println();
							itr3++;
						}
						break;
						
				
				case 6: System.exit(0);
						break;
				default: System.out.println("Wrong option");
			}
			System.out.println("If you want to Enter the choice again (Press 1) else (Press -1)");
			if(sc.nextInt()==1)
				choice2=true;
			else
				choice2=false;
			sc.nextLine();
	}while(choice2==true);
				
				
				sc.close();
		}

}
