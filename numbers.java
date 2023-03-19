import java.io.*;
import java.util.Scanner;
class numbers
{
public static void main(String args[])
{
int a,b,c,d,e;
System.out.println("enter the two numer:");
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=a+b;
d=a-b;
e=a*b;
System.out.println("add two number is:"+c);
System.out.println("subtraction two number is:"+d);
System.out.println("multiplication of two number is:"+e);
}
} 