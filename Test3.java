import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method - 1");
		String x = "iNeuron";
		x = x.toUpperCase();
		char [] a = x.toCharArray();
		int vowel = 0;
		int consonant = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
		}
		System.out.println("The no of vowels are " + vowel);
		System.out.println("The no of consonants are " + consonant);	
		System.out.println();
		
		System.out.println("User input");
		String s1 = new String();
		int vow = 0;
		int con = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		s1 = sc.nextLine();
		s1 = s1.toUpperCase();
		for(int i=0; i<s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(c != ' ')
			{
				if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				{
					vow++;
				}
				else
				{
					con++;
				}
			}
		}
		System.out.println("The no of vowels are " +  vow);
		System.out.println("The no of consonants are " + con);
		
	}

}
