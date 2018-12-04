package edu.iot.part3.chapter18_20180810;
import java.io.Serializable;

import edu.iot.part3.chapter18_20180810.ClassB;

public class ClassA implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//필드추가시 번호를 바꿔준다 deepcopy,clone에 해당한다
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
	
	@Override
	public String toString() {
		return "ClassA [field1=" + field1 + ", field2=" + field2 + ", field4=" + field4 + "]";
	}
	
}
