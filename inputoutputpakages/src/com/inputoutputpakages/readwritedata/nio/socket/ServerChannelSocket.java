package com.inputoutputpakages.readwritedata.nio.socket;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerChannelSocket {
	public static void main(String[] args) {

		int port = 9090;
		try (ServerSocketChannel server = ServerSocketChannel.open();

		) {
			// binding with port
			server.bind(new InetSocketAddress(port));
			System.out.println("Server Started at=" + port);
			// infinite server loop open until true
			while (true) {
				try (
						// client connection
						SocketChannel client = server.accept()) {
					System.out.println("Client Connected at=" + client.getRemoteAddress());

					ByteBuffer buffer = ByteBuffer.allocate(1024);
					int charVal = client.read(buffer);
					if (charVal != -1) {
						buffer.flip();
						byte[] byteArray = new byte[buffer.remaining()];// automatically mention the size of buffer data
						buffer.get(byteArray);
						try(
							ByteArrayInputStream bais=new ByteArrayInputStream(byteArray);
							ObjectInputStream ois=new ObjectInputStream(bais);
								
								){
							Book book1=(Book) ois.readObject();
							System.out.println(book1);
							
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}
					}

				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
