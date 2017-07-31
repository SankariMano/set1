package Guvi;
import java.io.*;


public class Star {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Integer n=Integer.parseInt(br.readLine());
	for(int i=n;i>0;i--)
	{	
	for(int j=i;j>0;j--)
	{
		System.out.print("*");
		
	}
	System.out.print(" ");
	for(int j=i;j>0;j--)
	{
		System.out.print("*");
		
	}
	
	System.out.println();
	
	}
	}

}
