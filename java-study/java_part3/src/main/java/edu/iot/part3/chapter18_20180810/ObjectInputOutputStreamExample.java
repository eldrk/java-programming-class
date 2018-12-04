package edu.iot.part3.chapter18_20180810;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		try(
				FileOutputStream fos = new FileOutputStream("c:/temp/Object.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(new Integer(10));
			oos.writeObject(new Double(3.14));
			oos.writeObject(new int[] {1,2,3});
			oos.writeObject(new String("홍길동"));
			oos.writeObject(new Date());
			
			oos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(
				FileInputStream fis = new FileInputStream("c:/temp/Object.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
		){
			int obj1 = (int) ois.readObject();
			double obj2 = (double) ois.readObject();
			int[] obj3 = (int[]) ois.readObject();
			String obj4 = (String) ois.readObject();
			Date obj5 = (Date) ois.readObject();
			
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3[0] +"," + obj3[1] +","+obj3[2]);
			System.out.println(obj4);
			System.out.println(obj5);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
