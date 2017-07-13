import java.io.*;
	import java.util.*;

	public class Uniq {
	public static void  main(String args[])throws IOException
		
		{
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 Integer n=Integer.parseInt(br.readLine());
			ArrayList<Integer>arr=new ArrayList<Integer>();
			ArrayList<Integer>arr1=new ArrayList<Integer>();
			ArrayList<Integer>arr2=new ArrayList<Integer>();
			TreeSet<Integer>ts=new TreeSet<Integer>();
			Integer a,count=0,flag;
			for(int i=0;i<n;i++)
			{
				a=Integer.parseInt(br.readLine());
				arr.add(a);
				ts.add(a);
			}
		arr1.addAll(ts);
	
		for(int z=0;z<arr1.size();z++)
		{
		count=0;
		for(int j=0;j<arr.size();j++)
		{ 
		if(arr1.get(z)==arr.get(j))
			count++;
	    }
		arr2.add(count);
		
	}
	
	for(int s=0;s<arr2.size();s++){
		if(arr2.get(s)==1)
		{
			System.out.println(arr1.get(s));
		}
	}
	
		}
	}
