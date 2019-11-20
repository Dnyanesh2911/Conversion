package conversion;

//Convert boolean to String

public class CbooleanTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of boolean to String***");
		
		//Using String.valueOf()
		boolean bvar = true;
		String str = String.valueOf(bvar);
		System.out.println("Using String.valueOf() string is : " + str);
		
		//Using Boolean.toString()
		bvar = false;
		str = Boolean.toString(bvar);
		System.out.println("Using Boolean.toString() string is : " + str);
	}

}

/*
***Conversion of boolean to String***
Using String.valueOf() string is : true
Using Boolean.toString() string is : false

*/
 