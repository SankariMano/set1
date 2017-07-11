
import java.io*;
public class Reverseint {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        Integer b=Integer.parseInt(br.readLine());
        Integer x;
        while(b>0)
        {
          x=b%10;
          b=b/10;
          System.out.print(x);
        }
        }
        }
