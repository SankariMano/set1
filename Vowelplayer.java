
import java.io.*;
import java.util.*;

public class Vowelplayer
{
public static void  main(String args[]) throws IOException
	
	{

	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	 String a=br.readLine();
          String temp=" ";
          String s[]=new String[a.length()];
	 ArrayList<Character>list=new ArrayList<Character>();
	for(Integer i=0;i<a.length();i++)
	{
		list.add(a.charAt(i));
		for(int j=0;j<list.size();j++)
		{
		if(list.get(j) == 'a' || list.get(j) == 'e' || list.get(j) == 'i' || list.get(j) == 'o' || list.get(j) == 'u')
		{
		list.remove(list.get(j));
		}
     }
        }          
           for(int y=0;y<list.size();y++)          
         {
         s[y]=String.valueOf(list.get(y));
             System.out.println(s[y]);
         }
        for(int u=list.size()-1;u>=0;u--)
               {
                temp =temp+s[u];                             
                
               }
                  System.out.println(temp);              
             }
             }        

   
