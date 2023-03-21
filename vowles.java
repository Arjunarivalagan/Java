import java.io.*;
import java.util.Scanner;
class vowles
{
public static void main(String arg[])
{
int vowles=0;
int nonvowles=0;
String a;
Scanner in=new Scanner(System.in);
System.out.println("enter the word:");
a=in.nextLine();
for(int i=0;i<a.length();i++)
{
char b=a.charAt(i);
if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
{
vowles=vowles+1;
}
else
{
nonvowles=nonvowles+1;
}
}
System.out.println("vowles count:"+vowles);
System.out.println("non vowles count:"+nonvowles);
}
}
