
public class Strrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method - 1");
		String s1 = "iNeuron";
		String s2 = "";
		for(int i=s1.length()-1 ; i>=0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		System.out.println();
		
		
		
		System.out.println("Method - 2");
		String s3 = "iNeuron";
		char [] b = s3.toCharArray();
		char [] a = new char[b.length];
		for(int i=0; i<s3.length(); i++)
		{
			 a[b.length-1-i]= b[i];
		}
		System.out.println(a);
		System.out.println();
		
		
		
		System.out.println("Method - 3"
		);
		String s4 = "iNeuron";
		char [] c = s4.toCharArray();
		int size1 = c.length;
		char [] d = new char[size1];
		int i=0;
		while(i!=size1) 
		{
			d[size1-1-i] = c[i];
			++i;
		}
		System.out.println(d);
	}

}
