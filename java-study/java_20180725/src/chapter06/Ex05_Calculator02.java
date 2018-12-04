package chapter06;

class Calculator02{
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
public class Ex05_Calculator02 {
	public static void main(String[] args) {
		Calculator02 myCalcu = new Calculator02();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10,20);
		
		System.out.println("정사각형 넓이 = " +result1);
		System.out.println("정사각형 넓이 = " +result2);
	}

}
