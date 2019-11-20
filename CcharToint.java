package conversion;

//Convert char to int

public class CcharToint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of char to int***");
		
		//Using implicit type casting
		char ch1 = 'A';
		char ch2 = 'Z';
		
		int inum1 = ch1;
		int inum2 = ch2;
		
		System.out.println("Using implicit type casting");
		System.out.println("Char : " + ch1 + "," + ch2 + "\nACSII value : " + inum1 + "," + inum2);
		
		//Using Character.getNumericValue()
		ch1 = 'p';
		inum1 = Character.getNumericValue(ch1);
		
		System.out.println("Using Character.getNumericValue()");
		System.out.println("Char : " + ch1 + "\nACSII value : " + inum1);
		
		//Using Integer.parseInt()
		ch2 = '9';
		inum2 = Integer.parseInt(String.valueOf(ch2));
		
		System.out.println("Using Integer.parseInt()");
		System.out.println("Char : " + ch2 + "\nACSII value : " + inum2);
	}
}

/*
***Conversion of char to int***
Using implicit type casting
Char : A,Z
ACSII value : 65,90
Using Character.getNumericValue()
Char : p
ACSII value : 25
Using Integer.parseInt()
Char : 9
ACSII value : 9
*/
