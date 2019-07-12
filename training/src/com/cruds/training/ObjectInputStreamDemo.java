//Requirement: DESERIALIZING
package com.cruds.training;

 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String...asdf) {
		try {
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("Student.ser"));
			Student student=(Student)oi.readObject();
			oi.close();
			System.out.println(student.getName()+":"+student.getRollNo());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
