public class q2 {
	
	void CountSort(int arr[])
	{
		int n = arr.length;
		int result [] = new int [n];
		
		int arr1[] = new int [256];
		
		for(int i = 0; i < 256; i++)
		{
			arr1[i] = 0;
		}
		
		for(int i = 0; i < n; i++)
		{
			arr1[arr[i]]++;
		}
		
		for(int i = 1; i <= 255; i++)
		{
			arr1[i] += arr1[i - 1];
		}
		
		for(int i = n - 1; i >= 0; i--)
		{
			result[arr1[arr[i]] - 1] = arr[i];
			--arr1[arr[i]];
		}
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = result[i];
		}
	}
	
    public static void main(String args[])
	{
		q2 obj = new q2();
		int arr[] = { 7, 7, 7, 0, 9, 6, 3, 3, 6 };

		obj.CountSort(arr);

		System.out.print("Sorted character array is ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i]);
		}
}