package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class WorkThread extends Thread {
	private Socket socket;
	
	public WorkThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
				BufferedReader r = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
				
				PrintWriter w = new PrintWriter(
				socket.getOutputStream());
			
				process(r,w);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {socket.close();}
			catch(IOException e){
				System.out.println(e);
			}
			
		}
		
	}
	abstract public void process(BufferedReader r, PrintWriter w) throws Exception;

	}

