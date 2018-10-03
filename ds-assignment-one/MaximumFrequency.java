import java.util.Scanner;
public class MaximumFrequency
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string:");
		String str= s.nextLine();
		s.close();

		int i,j,x=0,count;
		char ch1=' ';
		char[] ch=str.toCharArray();

		for(i=0;i<ch.length;i++)
		{
			count=1;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!='0'&&ch[j]!='0')
				{
					count++;
					ch[j]='0';
				}
			}
			if(x<=count)
			{
				ch1=ch[i];
				x=count;
			}
		}
		System.out.println("Character with maxium frequency is : "+ch1+" and  has " +x+ " occurences");
	}
}