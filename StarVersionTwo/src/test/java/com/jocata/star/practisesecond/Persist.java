package com.jocata.star.practisesecond;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
	 public static void main(String args[])throws Exception{  
		  Student s1 =new Student(211,"ravi");  
		  
		  FileOutputStream fout=new FileOutputStream("D:\\Zipfiles\\f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  out.flush();  
		  System.out.println("success");  
		 }  

	
}
