package conversion;

//Convert String to boolean

public class CstringToboolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of String to long***");
		
		//Using Boolean.parseBoolean()
		String str1 = "true";
		String str2 = "FALSE";
		String str3 = "Something";
		
		boolean bvar1 = Boolean.parseBoolean(str1);
		boolean bvar2 = Boolean.parseBoolean(str2);
		boolean bvar3 = Boolean.parseBoolean(str3);
		
		System.out.println("Using Boolean.parseBoolean() boolean is : " + bvar1 +" " + bvar2 + " " + bvar3);
		
		//Using Boolean.valueOf()
		str1 = "true";
		str2 = "TRUE";
		str3 = "Something";
		
		bvar1 = Boolean.valueOf(str1);
		bvar2 = Boolean.valueOf(str2);
		bvar3 = Boolean.valueOf(str3);
		
		System.out.println("Using Boolean.valueOf() boolean is : " + bvar1 +" " + bvar2 + " " + bvar3);
	}
}


/*
***Conversion of String to long***
Using Boolean.parseBoolean() boolean is : true false false
Using Boolean.valueOf() boolean is : true true false
*/