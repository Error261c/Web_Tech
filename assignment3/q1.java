public class q1 {
	
	public static int compare(String str1, String str2)
	{
		for(int i = 0; i < str1.length() && i < str2.length(); i++)
		{
			if((int)str1.charAt(i) == (int)str2.charAt(i))
			{
				continue;
			}
			else 
			{
				return (int)str1.charAt(i) - (int)str2.charAt(i);
			}
		}
		
		if(str1.length() != str2.length())
		{
			return str1.length() - str2.length();
		}
		
		return 0;
	}

	public static void main(String args[])
	{
		String str1 = new String("Adhyan");
		String str2 = new String("Mahajan");
		String str3 = new String("Adhyan");
		String str4 = new String("Mahajan Aashish");
		
		System.out.println(compare(str1,str2));
		System.out.println(compare(str1,str3));
		System.out.println(compare(str1,str4));
	}
}