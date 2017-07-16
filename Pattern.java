
import java.io.*;
import java.util.*;

public Pattern{
public static void  main(String args[]) throws IOException
	
	{

	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	 Integer n=Integer.parseInt(br.readLine());
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=n;j++)
             {              
                 if(i==1||j==1||i==n||j==n)                 
                 {                     
                  System.out.print("*");
               }else
                {
                   System.out.print(" ");    
                  }
                     
                  }        
              System.out.println();
             }
         

         }
        }
