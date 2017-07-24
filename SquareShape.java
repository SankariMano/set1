import java.io.*;
import java.util.*;
public class SquareShape {
	public static void  main(String args[]) throws IOException
				{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 ArrayList<Integer> list1=new ArrayList<Integer>();
         ArrayList<Integer> list2=new ArrayList<Integer>();
			        	          Integer arr[]=new Integer[4];
	          Integer arr1[]=new Integer[4];
	          Integer count=0,count1=0,max=0;
	          
	          System.out.println("x axis");
	          for(int j=0;j<arr.length;j++)
	          { 
	        	  arr[j]=Integer.parseInt(br.readLine()); 
	          }
	          System.out.println("y axis");
	          for(int j=0;j<arr.length;j++){
	        	  arr1[j]=Integer.parseInt(br.readLine()); 
	          }
	         System.out.print("Input:");
	          for(int i=0;i<arr.length;i++)
	          {
	        	  System.out.print("("+arr[i]+","+arr1[i]+")");
	        	 
	          } 
	         System.out.println();
	         for(int i=0;i<arr.length;i++)
	          {
	        	  for(int j=0;j<arr.length;j++)
	        	  {
	        	  
	        		  if(arr[i]==arr[j])
	        		  {
	        			  count++;
	        			  list1.add(count);
	        		  }
	        		  if(arr1[i]==arr1[j])
	        		  {
	        			  count1++;
	        			  list2.add(count1);
	        		  }
	        		  
	        	  }
	        	 
	        	  }
	         if(list1.get(list1.size()-1)==8&&list2.get(list2.size()-1)==8)
	        		 {
	        			 System.out.println("square");
	        		 }else if(max==0)
	        		 {
	        			 System.out.println("this is not square");
	        		 }
	       	          }

				}
