public class Pangramstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		x = x.replace(" ", "");
		char [] y = x.toCharArray();
		int [] a = new int[26];
		for(int i=0; i<y.length; i++)
		{
			int index = y[i] - 65;
			a[index] = 1;
		}
		for(int j=0; j<a.length; j++)
		{
			if(a[j] == 1)
			{
				
			}
			else
			{
				System.out.println("The Given String is a 'Non Pangram'");
				System.exit(0);
			}
		}
		System.out.println("The given String is a 'Pangram'");
	}

}
