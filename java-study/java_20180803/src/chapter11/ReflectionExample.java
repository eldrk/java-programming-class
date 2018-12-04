package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionExample {

	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.println(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("클래스 명 : ");
		String className = scanner.nextLine();
	
		Class clazz = Class.forName("chapter11." + className);
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		//Constructor[] constructors = clazz.getConstructors();
		//														 접근이 허용된 생성자만 추출
		Constructor[] constructors = clazz.getDeclaredConstructors();
		//													 상관없이생성자 추출
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		//Field[] fields = clazz.getFields()
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName()
													+" " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
			
		}
	}
}
