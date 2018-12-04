package chatting;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SenderThread extends Thread {
	Socket socket;
	String name;

	public SenderThread(Socket socket) {
		this.socket = socket;
	}

	public SenderThread(Socket socket,String name) {
		this.socket = socket;
		this.name = name;
		
	}
	
	public void run() {
		try {
			Scanner s = new Scanner(System.in);
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			while(true) {
				String str = s.nextLine();
				if(str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {socket.close();}
			catch(Exception ignored){}
		}
	}
	
	
}
