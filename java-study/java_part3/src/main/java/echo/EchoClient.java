package echo;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost",10000)){
			BufferedReader r = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			PrintWriter w = new PrintWriter(
					socket.getOutputStream());
			Scanner scanner = new Scanner(System.in);
			System.out.print("문자열 입력> ");
			String line = scanner.nextLine();
			
			w.println(line);
			w.flush();
			
			String receiveLine = r.readLine();
			System.out.println("수신 메시지 :" +receiveLine);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
