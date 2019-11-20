package conversion;

//Convert String to int

public class CstringToint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of String to int***");
		
		//Using Integer.parseInt()
		String str1 = "123";
		int inum1 = 100;
				
		int inum2 = Integer.parseInt(str1);
		int sum = inum1 + inum2;
		System.out.println("Using Integer.parseInt() Result is : " + sum);
	
		//Using Integer.valueOf()
		str1 = "-234";
		inum1 = 110;
		inum2 = Integer.valueOf(str1);
		
		sum = inum1 + inum2;
		System.out.println("Using Integer.valueOf() Result is : " + sum);
	}

}


//***Conversion of String to int***
//Using Integer.parseInt() Result is : 223
//Using Integer.valueOf() Result is : -124

