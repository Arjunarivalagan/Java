import java.io.*;
import java.util.Scanner;
class star
{
public static void main(String arg[])
{
int a,i,j;
System.out.println("enter the star:");
Scanner in=new Scanner(System.in);
a=in.nextInt();
for(i=1;i<=a;i++)
{
 for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}