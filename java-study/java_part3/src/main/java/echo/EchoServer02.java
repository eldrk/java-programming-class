package echo;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer02 {

	public static void main(String[] args) {
		Socket socket = null;
		try(ServerSocket server = new ServerSocket(10000)){
			while(true) {
				socket=server.accept();
				WorkThread work = new EchoThread(socket);
				work.start();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
