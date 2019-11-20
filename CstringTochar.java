package conversion;

//Convert String to char

public class CstringTochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of String to char***");
		
		//Using charAt() method of String class
		String s = "java";
		
		System.out.print("Using charAt() method of String class : ");
		
		for(int i = 0; i < s.length(); i++){  
		        char c = s.charAt(i);  
		        System.out.print(c + " ");
		}
		
		//Using toCharArray() method of String class
		char[] ch = s.toCharArray();    
		
		System.out.print("\nUsing toCharArray() method of String class : ");
		
		for(int i = 0; i < ch.length; i++){    
			System.out.print(ch[i] + " ");
		}
	}
}

/*
***Conversion of String to char***
Using charAt() method of String class : j a v a 
Using toCharArray() method of String class : j a v a 
*/
