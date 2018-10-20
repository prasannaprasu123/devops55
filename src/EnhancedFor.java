public class EnhancedFor
{
	public static void main(String[] args)
	{	int[] list ={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum = sumListEnhanced(list);
		System.out.println("Sum of elements in list: " + sum );
	}

public static int sumListEnhanced(int[] list)
	{	int total = 0;
		for(int val : list)
		{	total += val;
		}
		return total;
	}
}