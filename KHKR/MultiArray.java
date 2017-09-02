import java.util.Scanner;
public class MultiArray
{
	public static void main(String[] args) {
		
		// int[][] a = {{1,2},{3,4},{5,6}};
		// int[] b = {1,2,3,4};

		int[][] regularMulti = new int[2][2];
		//We are going to take input from the user
		Scanner scan = new Scanner(System.in);

		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				regularMulti[i][j] = scan.nextInt();
			}
		}

		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(regularMulti[i][j]+"\t");
			}
		}
		System.out.println();


		}
}