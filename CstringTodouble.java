package conversion;

//Convert String to double

public class CstringTodouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of String to double***");
		
		//Using Double.parseDouble()
		String str = "122.202";
		double dnum = Double.parseDouble(str);
		System.out.println("Using Double.parseDouble() double is : " + dnum);
		
		//Using Double.valueOf()
		str = "122.111";
		dnum = Double.valueOf(str);
		System.out.println("Using Double.valueOf() double is : " + dnum);
		
		//Using constructor of Double class
		str = "999.333";
		double var = new Double(str); //The constructor Double(String) is deprecated since version 9
		System.out.println("Using constructor Double() double is : " + var);
		
	}

}

/*
***Conversion of String to double***
Using Double.parseDouble() double is : 122.202
Using Double.valueOf() double is : 122.111
Using constructor Double() double is : 999.333
*/