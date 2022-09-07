public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("All small letters");
			String s1 = "javaprogramming";
			char [] a = s1.toCharArray();
			char temp; 
			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i] > a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println(a);
			System.out.println();
			
			System.out.println("All Capital letters");
			String s2 = "JAVAPROGRAMMING";
			char [] b = s2.toCharArray();
			char temp1; 
			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(b[i] > b[j])
					{
						temp1 = b[i];
						b[i] = b[j];
						b[j] = temp1;
					}
				}
			}
			System.out.println(b);
			System.out.println();
			
			
			System.out.println("capital letters will be sorted first");
			String s3 = "Java Programming";
			char [] c = s3.toCharArray();
			char temp2; 
			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(c[i] > c[j])
					{
						temp2 = c[i];
						c[i] = c[j];
						c[j] = temp2;
					}
				}
			}
			System.out.println(c);
			System.out.println();
			
			
			System.out.println("capital and Small letters with spaces");
			String s4 = "Java Programming";
			s4 = s4.replace(" ", "");
			s4 = s4.toUpperCase();
			char [] d = s4.toCharArray();
			char temp3; 
			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(d[i] > d[j])
					{
						temp3 = d[i];
						d[i] = d[j];
						d[j] = temp3;
					}
				}
			}
			System.out.println(d);
			System.out.println();
	}

}
