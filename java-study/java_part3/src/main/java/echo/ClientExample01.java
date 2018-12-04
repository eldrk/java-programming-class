package echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample01 {

	public static void main(String[] args) {
		try(Socket socket = new Socket("localhost",10000)){
			InputStream in = socket.getInputStream();     //수신(입력) 스트림
			OutputStream out = socket.getOutputStream();  //전송(출력) 스트림
			
			String str = "Hello, server";
			out.write(str.getBytes()); //메시지 전송
			out.flush();
			
			byte arr[] = new byte[100]; //수신 버퍼
			in.read(arr); //메시지 수신
			System.out.println(new String(arr));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
