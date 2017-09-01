import java.util.Scanner;

public class input
{
public static void main(String[] args) 
{

Scanner in = new Scanner(System.in);
Fibonacci f=new Fibonacci(5);
f.getseries();


}
}

class Fibonacci
{
int n;
Fibonacci(int a)
{
n = a;
}
void getSeries(int number)
{
int a = 0;
int b = 1;
int c,i;
if(n==2)
System.out.print(a+" "+b);
else if(n==1)
System.out.print(a);
else
	{for(i=2;i<=n;i++)
{
	c=a+b;
	a=b;
	b=c;
	System.out.print(" "+c);
}}


}
}
