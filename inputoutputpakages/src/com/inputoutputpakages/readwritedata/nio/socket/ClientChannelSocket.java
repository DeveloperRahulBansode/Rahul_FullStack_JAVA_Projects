package com.inputoutputpakages.readwritedata.nio.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientChannelSocket {
	
	public static void main(String[] args) {
		
	
	int port=9090;
	String host="localHost";
	
	try(
			SocketChannel client=SocketChannel.open();
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(baos);
			){
		client.connect(new InetSocketAddress(host,port));
		Book book=new Book(1,"Reach DAD pour DAD");
		oos.writeObject(book);
		oos.flush();
		
		ByteBuffer buffer=ByteBuffer.wrap(baos.toByteArray());
		client.write(buffer);
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
