 import java.io.*;
 public class Factorial{
 public static void main(String[] args) throws IOException {
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer n=Integer.parseInt(br.readLine());
        int max=1;
        if(n==0)
        {
            System.out.println("1");
        }else{
        for(int i=1;i<=n;i++){
            max=max*i;
        }
        }
        System.out.println(max);
    }
    
}
