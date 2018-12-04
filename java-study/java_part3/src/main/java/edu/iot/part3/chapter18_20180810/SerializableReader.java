package edu.iot.part3.chapter18_20180810;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializableReader {

	public static void main(String[] args) {
		List<ClassA> list = null;
		try(
				FileInputStream fis = new FileInputStream("c:/temp/Object.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
		){
			list = (List<ClassA>)ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(ClassA v : list) {
			System.out.println("field1: " +v.field1);
			System.out.println("field2.field1: " + v.field2.field1);
			System.out.println("field3: " +v.field3);
			System.out.println("field4: " +v.field4);
			System.out.println();
		}
	}

}
