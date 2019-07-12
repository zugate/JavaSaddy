package com.cruds.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.cruds.exception.StudentException;
import com.cruds.training.Student;

public class ReaderDemo {

	public static void main(String...asd) {
		
		
		Student[] s=new Student[25];
		
		try(FileReader fr=new FileReader("students.csv");
				BufferedReader br=new BufferedReader(fr)){
			String line=br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileReader fr2=new FileReader("students.csv");
				BufferedReader br2=new BufferedReader(fr2)){
			String[] line=new String[2];
		
			int i=0;
			String line2=null;
			while((line2=br2.readLine()) != null && (line2.trim().length()>0)) {
				line=line2.split(",");
				s[i]=new Student(Integer.parseInt(line[0]),line[1]);
				i++;
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ef) {
			// TODO Auto-generated catch block
			ef.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
