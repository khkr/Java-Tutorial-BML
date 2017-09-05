import java.util.Scanner;

public class Overloading
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Area a1 = new Area();

		a1.findArea(7);
		
		a1.findArea(23,4);
	}
}

class Area
{
	//Overloading 
	void findArea(int radius)
	{
		System.out.println("Area of circle is: "+(float)(22*radius*radius/7));
	}

	void findArea(int length,int breadth)
	{
		System.out.println("Area of rectangle is: "+length*breadth);
	}
}