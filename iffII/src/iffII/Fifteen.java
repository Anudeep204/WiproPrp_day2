package iffII;
import java.util.Scanner;
public class Fifteen 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);		
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print("*"+"\t");
}
System.out.println("");
}
}
}
