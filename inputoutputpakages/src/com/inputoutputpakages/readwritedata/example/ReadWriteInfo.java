package com.inputoutputpakages.readwritedata.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadWriteInfo {
	public static void main(String[] args) {

		String line = "";
		StringBuilder sb= new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));) {
			while (!line.equals("$")) {
				line = br.readLine();
				if (!line.equals("$")) {
					bw.write(line);
					bw.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			while ((line = br.readLine()) != null) {
				sb.append(line);
//				System.out.println(line);

			}
			System.out.println(sb.toString());
			String data=sb.toString();
			StringTokenizer token=new StringTokenizer(data,"[,.;\\r\\n\\s ]");
			String [] tokenArray=new String[token.countTokens()];
			int i=0;
			while (token.hasMoreTokens()) 
				tokenArray[i++]=token.nextToken();
				
//				System.out.println(tokenArray.toString());
				int counter=0;
				for(String str:tokenArray)
					if(str.equalsIgnoreCase("rahul"))
						counter++;
				
				System.out.println("Rahul="+counter);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
