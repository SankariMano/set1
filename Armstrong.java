
import java.io.*;
public class Armstrong {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer n=Integer.parseInt(br.readLine());
        int temp=n;
        
        Integer z,ans=0;
        while(n>0){
            z=n%10;
            n=n/10;
            ans=ans+(z*z*z);
         
        }
       if(temp==ans)
        {
          System.out.println(temp+ " is an armstrong num");
        }else
          System.out.println(temp+ " is not an armstrong num");  
    }
    
}
