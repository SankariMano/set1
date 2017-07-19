import java.io.*;
import java.util.*;
public class Primenum {
public static void  main(String args[]) throws IOException
	
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 ArrayList<Integer> list=new ArrayList<Integer>();
          ArrayList<Integer> list1=new ArrayList<Integer>();
          ArrayList<Integer> list2=new ArrayList<Integer>();
          TreeSet<Integer>ts=new TreeSet<Integer>();
          Integer arr[]=new Integer[100];
          Integer arr1[]=new Integer[100];
         Integer flag=0,x,a=0,b,count=0;
for(int i=1;i<=100;i++)
         {                  
             for(int j=2;j<i;j++)
             {       
                 if(i%j ==0)
                 {
                 flag=0 ;
                 break;                 
                 }
               else
                {
                flag=1;
                }
               
            }              
if(flag==1)             
{
    list.add(i);
    
} 
  }  
System.out.println(list);
for(int i=0;i<list.size();i++)
{
arr[i]=list.get(i);
arr1[i]=arr[i]%10;
arr[i]=arr[i]/10;
list1.add(arr[i]+arr1[i]);
if(list1.get(i)==list.get(i))
ts.add(list1.get(i));


Collections.sort(list1);
}

for(int i=0;i<list1.size() ;i++){
	for(int k=list1.get(i);k<list1.get(list1.size()-1);k++)
{
if(k==2)
{
	ts.add(k);
}
	for(int j=2;j<k;j++)
	{
    {    
        if(k%j ==0)
        {
        flag=0 ;
        break;                 
        }
      else
       {
       flag=1;
       }
    }
	}
               
if(flag==1)             
{
ts.add(k);
ts.add(list1.get(list1.size()-1));
}
} 
}  
System.out.println(list1);
System.out.println(ts); 

	}

}
