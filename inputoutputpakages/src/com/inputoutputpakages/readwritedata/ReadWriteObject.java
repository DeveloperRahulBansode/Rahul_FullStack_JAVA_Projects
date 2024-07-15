package com.inputoutputpakages.readwritedata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.inputoutputpakages.readwritedata.entoty.Employee;

public class ReadWriteObject {

	public static void main(String[] args) {

		Employee emp = new Employee(1, "Rahul");

		try (FileOutputStream fis = new FileOutputStream("student.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fis);) {
			oos.writeObject(emp);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try(
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.txt"));	
				){
			Employee emp2=(Employee) ois.readObject();
			System.out.println(emp2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
