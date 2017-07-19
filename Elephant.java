package Guvi;
import java.io.*;
import java.util.*;
public class Elephant {
	
	
	public static void  main(String args[]) throws IOException
		
		{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter m");
Integer m=Integer.parseInt(br.readLine());
System.out.println("Enter max");
Integer max=Integer.parseInt(br.readLine());
Integer arr[]=new Integer[m];
Integer sum=0,count=0;
for(int i=0;i<m;i++)
{
	arr[i]=Integer.parseInt(br.readLine());
	sum=sum+arr[i];
	if(sum<max)
	{
		count++;
	}
	
}
System.out.println(count);
}
}
