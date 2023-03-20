import java.io.*;
import java.util.Scanner;
class leapyear
{
public static void main(String arg[])
{
int a;
Scanner in=new Scanner(System.in);
System.out.println("Enter the year:");
a=in.nextInt();
if(a%4==0)
{
System.out.println(""+a+" is leap years:");
}
else
{
System.out.println(""+a+" is not leap years:");
}
}
}
