package com.inputoutputpakages.readwritedata;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.inputoutputpakages.readwritedata.entoty.EmpArray;
import com.inputoutputpakages.readwritedata.entoty.Employee;


public class ReadWriteObjectArray {


		public static void main(String[] args) {

			EmpArray[] empArray=new EmpArray[3];
			empArray[0]=new EmpArray(1, "rahul");
			
			

			try (FileOutputStream fis = new FileOutputStream("stuarray.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fis);) {
				oos.writeObject(empArray);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			try(
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("stuarray.txt"));	
					){
				Employee[] emp1Array=(Employee[]) ois.readObject();
				System.out.println(emp1Array.toString());
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			

		}

	}



