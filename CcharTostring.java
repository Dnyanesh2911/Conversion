package conversion;

//Convert char to String

public class CcharTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of char to String***");
		
		//Using String.valueOf()
		char ch = 'p';
		String str = String.valueOf(ch);
		
		System.out.println("Using String.valueOf() String is : " + str);
		
		//Using Character.toString()
		ch = 'z';
		str = Character.toString(ch);
		
		System.out.println("Using Character.toString() String is : " + str);
	}

}

/*
***Conversion of char to String***
Using String.valueOf() String is : p
Using Character.toString() String is : z
*/