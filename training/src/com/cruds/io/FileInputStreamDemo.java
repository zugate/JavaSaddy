package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	
	public static void main(String...asa) {
		
		try(FileInputStream fis=new FileInputStream("D:\\SeleniumJavaJitendra\\Tools\\Java\\jdk1.8.0_152\\README.html")) {
			
			int size=fis.available();
			System.out.println(size);//prints number of bytes in the file
			
			byte[] ab=new byte[size];
			
			fis.read(ab);//populating the array
			
			System.out.println(new String(ab));
//			for(int i=0;i<size;i++) {
//				System.out.print((char)fis.read());
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
