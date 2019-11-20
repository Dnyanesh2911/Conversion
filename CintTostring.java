package conversion;

//Convert int to string

public class CintTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of int to String***");
		
		int ivar = 111;
		
		//1.Using String.valueOf()
		String str = String.valueOf(ivar);
		
		System.out.println("Using String.valueOf() After converted String is : " + str);
		System.out.println(555 + str);
		
		//2.Using Integer.toString()
		str = Integer.toString(ivar);
		
		System.out.println("Using Integer.toString() After converted String is : " + str);
		System.out.println(555 + str);
		
		//3.Using String.format()
		str = String.format("%d",ivar);
		
		System.out.println("Using String.format() After converted String is : " + str);
		
	}
}


/*
***Conversion of int to String***
Using String.valueOf() After converted String is : 111
555111
Using Integer.toString() After converted String is : 111
555111
Using String.format() After converted String is : 111
*/
