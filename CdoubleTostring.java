package conversion;

import java.text.DecimalFormat;

//Convert double to string

public class CdoubleTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of double to String***");
		
		//Using String.valueOf()
		double dnum = 99.9999;
		String str = String.valueOf(dnum);
		System.out.println("Using String.valueOf() String is : " + str);
		
		//Using toString() of Double wrapper class
		dnum = -105.556;
		str = Double.toString(dnum);
		System.out.println("Using Double.toString() String is : " + str);
		
		//Using String.format()
		dnum = -99.999;
		str = String.format("%f", dnum);
		System.out.println("Using String.format() String is : " + str);
		
		//Using DecimalFormat.format()
		dnum = -99.999;
		DecimalFormat df = new DecimalFormat("#.000");
		str = df.format(dnum);
		System.out.println("Using DecimalFormat.format() String is : " + str);
		
		//Using StringBuffer and StringBuilder
		//double -> StringBuffer -> String
		dnum = 89.91;
		StringBuffer sb1 = new StringBuffer(); //instead of stringBuffer we can used StringBuilder
		sb1.append(dnum);
		
		str = sb1.toString();
		System.out.println("Using StringBuffer String is : " + str);
	}

}

/*
***Conversion of double to String***
Using String.valueOf() String is : 99.9999
Using Double.toString() String is : -105.556
Using String.format() String is : -99.999000
Using DecimalFormat.format() String is : -99.999
Using StringBuffer String is : 89.91
*/