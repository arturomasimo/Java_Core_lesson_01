package lession1;

public class lession1 {

	public static void main(String[] args) 
	{
		byte byte_= -100;
		short shotr_ = 2020;
		int int_ = -34345;
		long long_ = 200000000;
		float float_ = 12341.123f;
		double double_ = -12.22e10;

		System.out.println("Примітивні типи");
		System.out.println("byte: Min "+ Byte.MIN_VALUE +" Max "+ Byte.MAX_VALUE);
		System.out.println("short: Min "+ Short.MIN_VALUE +" Max "+ Short.MAX_VALUE);
		System.out.println("int: Min "+ Integer.MIN_VALUE +" Max "+ Integer.MAX_VALUE);
		System.out.println("long: Min "+ Long.MIN_VALUE +" Max "+ Long.MAX_VALUE);
		System.out.println("float: Min "+ Float.MIN_VALUE +" Max "+ Float.MAX_VALUE);
		System.out.println("double: Min "+ Double.MIN_VALUE +" Max "+ Double.MAX_VALUE);
		System.out.printf("Create random array \n");
		int array1[] = new int [10];
		for (int i=0; i<10; i++) 
			{
				array1[i]= (int) (Math.random()*100);
				System.out.print(array1[i]+" ");
			}
		System.out.println();
		System.out.println("found max & min values of array");
		int min = array1[0];
		int max = array1[0];
		for (int i=0; i< array1.length; i++) {
			if (array1[i]>max) {max = array1[i];}
			if (array1[i]<min) {min = array1[i];}
		}
		System.out.println("Min values ="+min + " Max values ="+max);
	}

}
