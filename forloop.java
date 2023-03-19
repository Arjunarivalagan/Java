import java.io.*;
import java.util.Scanner;
class forloop
{
public static void main(String arg[])
{
int a,i;
System.out.println("enter the numer:");
Scanner in=new Scanner(System.in);
a=in.nextInt();
for(i=0;i<=a;i++)
{
System.out.println("numer:"+i);
}
}
}