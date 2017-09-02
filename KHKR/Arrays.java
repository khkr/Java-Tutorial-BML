import java.util.Scanner;
//We are going to learn types of arrays
public class Arrays
{
	public static void main(String[] args)
	{
		//In C int arrays : int a[10];

		/**
		*THIS CAN'T HAPPEN IN C(I am talking about dynamic size allocation
		*for arrays)
		*printf("Enter input");
		*scanf("%d",&n);
		*int a[n];
		**/
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<a.length;i++)
			a[i] = scan.nextInt();

		
	}
}