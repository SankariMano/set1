import java.io.*;

public class Camelcase {
public static void  main(String args[])throws IOException
	
	{int i,j=0;
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 String s=br.readLine();
		 String arr1[]=s.split(" ");
		
//		 System.out.println(String.valueOf(arr1));
		 System.out.println();
		 String arr[]=new String[arr1.length];
	
		for(i=0;i<arr1.length;i++)
		{ 
			if(arr1[i].length()>1){
			arr[i]=arr1[i].substring(1);
			//System.out.println(str);
			}
		
		else{
			arr[i]=arr1[i];
			
			}
			if(arr1[i].length()>1)
				System.out.println(String.valueOf(Character.toUpperCase(arr1[i].charAt(0))+arr[i]));
	//	System.out.println(String.valueOf(arr1[i].charAt(0)).toUpperCase()+arr[i]);
			else
			System.out.println(arr[i].toUpperCase());
		}
	
}
}


