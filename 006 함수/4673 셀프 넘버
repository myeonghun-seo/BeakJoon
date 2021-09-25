import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        boolean[] self = new boolean[10001];
        
        for(int i = 1; i < 10001; i++)
        {
            int n = disum(i);
                
            if(n < 10001)
            {
                self[n] = true;
            }
            
        }
        
        for(int i = 1; i < 10001; i++)
        {
            if(!self[i])
                
                System.out.println(i);
        }
        
    }
    
    static int disum(int n)
    {
        int sum = n;
        
        while(n != 0)
        {
            sum += (n % 10);
            n = n / 10;
        }
        
        return sum;
        
    }
    
}
