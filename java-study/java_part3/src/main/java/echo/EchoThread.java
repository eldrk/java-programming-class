package echo;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoThread extends WorkThread {

	public EchoThread(Socket socket) {
		super(socket);
	}

	@Override
	public
	void process(BufferedReader r, PrintWriter w) throws Exception{
		String line = r.readLine();
		System.out.println("서버 수신 메시지:" +line);
		
			w.println(line);
			w.flush();
	}

}
