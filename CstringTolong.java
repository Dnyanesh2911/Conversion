package conversion;

//Convert String to long

public class CstringTolong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of String to long***");
		
		//Using Long.parseLong()
		String str1 = "21111";
		String str2 = "-11111";
		
		long lnum1 = Long.parseLong(str1);
		long lnum2 = Long.parseLong(str2);
		
		System.out.print("Using Long.parseLong() long Result is : ");
		System.out.println(lnum1+lnum2);
		
		//Using Long.valueOf()
		str1 = "11111";
		str2 = "38888";
		
		lnum1 = Long.valueOf(str1);
		lnum2 = Long.valueOf(str2);
		
		System.out.print("Using Long.valueOf() long Result is : ");
		System.out.println(lnum1+lnum2);
		
		//Using constructor of Long class
		str1 = "10000";
		str2 = "22222";
		
		long num1 = new Long(str1); //The constructor (String) is deprecated since version 9
		long num2 = new Long(str2); //The constructor (String) is deprecated since version 9
		
		System.out.print("Using constructor Long() long Result is : ");
		System.out.println(num1 * num2);

	}

}

/*
***Conversion of String to long***
Using Long.parseLong() long Result is : 10000
Using Long.valueOf() long Result is : 49999
Using constructor Long() long Result is : 222220000

*/
