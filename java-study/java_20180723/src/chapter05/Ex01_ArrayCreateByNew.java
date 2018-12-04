package chapter05;

public class Ex01_ArrayCreateByNew {
	public static void main(String[] args) {//JVM이 
		System.out.println(args.length); //String[]args = { };
		System.out.println();
		
		int[] arr1 = new int[20];
		for(int i=0; i<arr1.length;i++) {
			System.out.println("arr1[" +i+ "] : " +arr1[i]);
		}
		arr1 = new int[] {10,20,30};
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1[" +i+ "] : " +arr1[i]);
		}
		System.out.println();
		
		double[]arr2 = new double[12];
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2[" +i+ "] : " +arr2[i]);
		}
		arr2[0]=0.1;
		arr2[1]=0.2;
		arr2[2]=0.3;
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2[" +i+ "] : " +arr2[i]);
		}
		System.out.println();
		
		String[] arr3 = new String[9];
		for(int i=0;i<arr3.length;i++) {
			System.out.println("arr3[" +i+ "] : " +arr3[i]);
		}
		arr3[0]="1월";
		arr3[1]="2월";
		arr3[2]="3월";
		arr3[3]="11월";
		arr3[4]="12월";
		for(int i=0;i<arr3.length;i++) {
			System.out.println("arr3[" +i+ "] : " +arr3[i]);
		}
		System.out.println();
		
		String[] arr4 = new String[] {"4월","5월","6월","7월","8월","9월","10월"};
		for(int i=0;i<arr4.length;i++) {
			System.out.println("arr4[" +i+ "] : " +arr4[i]);
		}
		
		
	}

}
