package conversion;

//Convert long to String

public class ClongTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of long to String***");
		
		//Using String.valueOf()
		long l = 123;
		String str = String.valueOf(l);
		System.out.println("Using String.valueOf() String is : " + str);
		
		//Using Long.toString()
		l = 200;
		str = Long.toString(l);
		System.out.println("Using Long.toString() String is : " + str);
	}
}

/*
***Conversion of long to String***
Using String.valueOf() String is : 123
Using Long.toString() String is : 200
*/