import java.util.Arrays;

public class q3 {
	
	public static void main(String args[])
	{
		String s = new String("Adhyan Mahajan");
		System.out.println(s);
		char []arr = s.toCharArray();
		Arrays.sort(arr);
		System.out.println(String.valueOf(arr));
	}
}