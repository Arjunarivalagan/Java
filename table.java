import java.io.*;
import java.util.Scanner;
class table
{
public static void main(String arg[])
{
int a,b,i;
Scanner in=new Scanner(System.in);
System.out.println("enter the table:");
a=in.nextInt();
System.out.println("enter the rows:");
b=in.nextInt();
for(i=1;i<=b;i++)
{

System.out.println(""+i+"*"+a+"="+(i*a));
}
}
}
