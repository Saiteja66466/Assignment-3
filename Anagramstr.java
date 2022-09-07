import java.util.Arrays;

public class Anagramstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Binary";
		String s2 = "Brainy";
		
		char [] a = s1.toCharArray();
		char [] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		System.out.println("Method - 1");
		if(result == true)
		{
			System.out.println("Strings are anagrams");
		}
		else
		{
			System.out.println("Strings are not anagrams");
		}
		System.out.println();
		
		
		
		
		
		String s3 = "SHe iS aRadHya";
		String s4 = "iS shE HrAdAYa";
		
		s3 = s3.replace(" ", "");
		s4 = s4.replace(" ", "");
		
		s3 = s3.toUpperCase();
		s4 = s4.toUpperCase();
		
		char [] c = s3.toCharArray();
		char [] d = s4.toCharArray();

		Arrays.sort(c);
		Arrays.sort(d);
		
		boolean result1 = Arrays.equals(c, d);
		System.out.println("Method - 2");
		if(result1 == true)
		{
			System.out.println("Strings are anagrams");
		}
		else
		{
			System.out.println("Strings are not anagrams");
		}
		
	}

}
