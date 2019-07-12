package com.cruds.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cruds.exception.StudentException;
import com.cruds.training.Student;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		try {
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("Student.ser"));
			Student s1=new Student(101, "Anil");
			os.writeObject(s1);
			os.close();
			System.out.println("Object Written Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
