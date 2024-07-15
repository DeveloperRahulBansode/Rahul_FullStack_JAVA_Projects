package com.inputoutputpakages.readwritedata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class ReadWriteData {
	public static void main(String[] args) throws IOException {
		// input Keyboard
//		
//		InputStreamReader str=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(str);
		// single line construct and define
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line="";
		try {
			System.out.println("Enter Number");
			int number = Integer.parseInt(br.readLine());
			System.out.println(number);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			str.close();
			br.close();
		}

		// file read Write Operation
		while(line.equals("$")) {
		try (Writer fr = new FileWriter("demo.txt");
			
			BufferedWriter bw=new BufferedWriter(fr);	) {
			bw.write("Hii Rahul");//multiple .write use for multiple data input in file
			bw.write("\nHii Rahul");//for next line you can use also .nextline()
		}

	}

}}
