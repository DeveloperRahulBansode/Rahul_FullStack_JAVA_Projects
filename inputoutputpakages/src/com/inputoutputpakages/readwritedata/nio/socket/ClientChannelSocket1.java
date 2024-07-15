package com.inputoutputpakages.readwritedata.nio.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientChannelSocket1 {
	
	public static void main(String[] args) {
		int  port=9090;
		
		String host="localHost";
		
		try(
				SocketChannel client1=SocketChannel.open();
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				ObjectOutputStream oos=new ObjectOutputStream(baos);
				
				){
			client1.connect(new InetSocketAddress(host,port));
			Book book1=new Book(2,"Advance Carrar course in IT");
			oos.writeObject(book1);
			oos.flush();
			
			ByteBuffer buffer=ByteBuffer.wrap(baos.toByteArray());
			client1.write(buffer);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
