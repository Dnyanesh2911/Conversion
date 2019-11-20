package conversion;

//Find ACSII value of a character

public class CcharToAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***ACSII value of a character***");
		char ch = 'p';
		int asciicode = ch;
		
		int asciivalue = (int)ch;
		
		System.out.println("char " + ch + " : " +asciicode + " " + asciivalue);
	}
}

/*
***ACSII value of a character***
char p : 112 112
*/