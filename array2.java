import java.util.Scanner;
public class array2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int n;
		double sum = 0;
		System.out.print("\n\n\n\tONE DIMENTIONAL ARRAY ");
		System.out.print("\n\n\nEnter the Array length : ");

		n = input.nextInt();

		int[] num = new int[n];
		System.out.print ("\nPlease enter " + n + " numbers : ");

		
		
		for(int i = 0; i<n; i++)
		{
			num[i] = input.nextInt();
			

		}
		System.out.print("\nThe 1-d array is :       ");

		for(int i = 0; i<n; i++)
		{
			
			System.out.print(" " + num[i] + "  ");

		}

		for(int i = 0; i<n; i++)
		{
			 sum = sum + num[i];
		}
		System.out.println("\n\nThe sum of the array is : " + sum);

		double avg = sum/n;
		System.out.println("\n\nThe Average of the array is : " + avg);

		int max = num[0];
		for(int i = 0; i<n; i++)
		{
			if (max < num[i])
			{
				max = num[i];

			}
		}
		System.out.println("\nMaximum Number is :"+max);

		int min = num[0];
		for(int i = 0; i<n; i++)
		{
			if (min > num[i])
			{
				min = num[i];

			}
		}
		System.out.println("\nMinimum Number is :"+min);








		
	}

}