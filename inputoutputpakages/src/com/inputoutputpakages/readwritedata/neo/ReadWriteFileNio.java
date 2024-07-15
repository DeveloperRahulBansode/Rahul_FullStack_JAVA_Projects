package com.inputoutputpakages.readwritedata.neo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadWriteFileNio {
	public static void main(String[] args) {
		try(
			FileInputStream fis=new FileInputStream("demo.txt");
				FileChannel channel=fis.getChannel();
				
				
				){
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			int charVal=channel.read(buffer);
			while(charVal!=-1) {
				//read /right buffer flapping using flip()
				buffer.flip();
				while(buffer.hasRemaining())
				System.out.print((char)buffer.get());
			
			buffer.clear();
			charVal=channel.read(buffer);
			
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
