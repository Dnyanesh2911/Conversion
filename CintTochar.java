package conversion;

//Convert int to char (type casting)

public class CintTochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of int to char***");
		
		int inum = 70;
		char ch = (char)inum;
		
		System.out.println("Integer : " + inum + " ASCII char : " + ch);
		
		//If integer value in a single quote, it will store actual character in char variable.
		inum = '5';
		ch = (char)inum;    
		System.out.println("If integer value in a single quote, it will store actual character in char variable : " + ch);
	}
}

/*
***Conversion of int to char***
Integer : 70 ASCII char : F
If integer value in a single quote, it will store actual character in char variable : 5
*/
