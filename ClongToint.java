package conversion;

//Convert long to int

public class ClongToint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of long to int***");
		
		//Using type casting
		long lnum = 1000;
		int inum = (int)lnum;
		
		System.out.println("Using type casting : " + inum);
		
		//Using intValue()[long wrapper class]
		Long lnum1= 99L;  
		inum = lnum1.intValue();
		
		System.out.println("Using intValue()[long wrapper class] : " + inum);
	}
}

/*
***Conversion of long to int***
Using type casting : 1000
Using intValue()[long wrapper class] : 99
*/