import java.io.*;
import java.util.*;
public class Panagram {
	public static void  main(String args[]) throws IOException	
	{	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	TreeSet<Character>set=new TreeSet<Character>();
	Integer count=0;
	//ArrayList<Character> list=new ArrayList<Character>();
	String s=br.readLine();
	for(int i=0;i<s.length();i++)
	{
	Character a=s.charAt(i);
	if(a!=' ')
	{
		set.add(a);
	}
	}
	for(Character c:set)
	{
		if((c>=65||c<=90)&&(c>=97||c<=122) )
		{
		count++;	
		}
	}
	if(count==26)
	{
		System.out.println("This is Panagram");
	}else
	
System.out.println("This is not Panagram");
	//System.out.println(set);
	
}
}
