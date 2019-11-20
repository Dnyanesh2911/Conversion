package conversion;

//Convert int to long

public class CintTolong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of int to long***");
		
		//Using implicit type casting
		int inum = 10;
		long lnum = inum;
		
		System.out.println("Using implicit type casting : " + lnum);
		
		//Using Long.valueOf()[long wrapper class]
		inum = 99;
		lnum = Long.valueOf(inum);
		
		System.out.println("Using Long.valueOf()[long wrapper class] : " + lnum);
	}
}

/*
***Conversion of int to long***
Using implicit type casting : 10
Using Long.valueOf()[long wrapper class] : 99
*/
