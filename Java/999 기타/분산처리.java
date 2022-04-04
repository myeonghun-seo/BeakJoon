import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();   
            int pow = 1;
            
            for(int j = 0; j < b; j++)
            {
                pow *= a % 10;
                
                if(pow > 10)
                    pow = pow % 10;
            }
            
            System.out.println(pow == 0 ? 10 : pow);
        }

        sc.close();
        
    }
    
}
