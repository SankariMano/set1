
import java.io.*;
import java.util.*;
public class Primecount {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the num");
        Integer n=Integer.parseInt(br.readLine());
        Integer arr[]=new Integer[n];
        
        Integer count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]==1) 
            {
                count=count+1;
            }
            for(int j=2;j<arr[i]/2;j++)
            {
                if(arr[i]%j!=0)
                {
                    count++;
                   break;
                 }
            }
        }
            
    System.out.println(count);

}
