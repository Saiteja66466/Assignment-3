public class Specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "!.iNeuron..!#$@%";
		char [] a = s1.toCharArray();
		int specchar = 0;
		int normalchar = 0;
		for(int i=0; i<a.length; i++)
		{
			if((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z'))
			{
				normalchar++;
			}
			else
			{
				specchar++;
			}
		}
		System.out.println(specchar);
		System.out.println(a.length);
	}
}
