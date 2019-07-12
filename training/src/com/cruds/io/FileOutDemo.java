package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo {

	public static void main(String...asd) {
		
		byte[] data=null;
		try(FileInputStream fis= new FileInputStream("D:\\\\SeleniumJavaJitendra\\\\Tools\\\\Java\\\\jdk1.8.0_152\\\\README.html")) {
			
			data=new byte[fis.available()];
			fis.read(data);
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//String msg="Hello World";
		
		try {
			FileOutputStream fos=new FileOutputStream("output.txt");
			fos.write(data);
			fos.close();
			System.out.println("File written sucessfully!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
