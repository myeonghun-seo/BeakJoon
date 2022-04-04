import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num11 = 0;
        int num22 = 0;
        
        sc.close();
        
        while(num1 != 0)
        {
            num11 += num1 % 10;
            num1 /= 10;
            
            if(num1 != 0)
                num11 *= 10;
        }
        
        while(num2 != 0)
        {
            num22 += num2 % 10;
            num2 /= 10;
            
            if(num2 != 0)
                num22 *= 10;
        }
        
        System.out.println(num11 > num22 ? num11 : num22);
        
    }
    
}
