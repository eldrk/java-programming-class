package chapter10;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		System.out.println("args[0] : " +data1);
		System.out.println("args[1] : " +data2);
		System.out.println(args.length);
	}
}
