import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        int num = sc.nextInt();
        int count = 0;
        
        sc.close();
        
        for(int i = 1; i < num + 1; i++)
        {
            if(i > 99)
            {
                if(dibool(i))
                    count++;
                
                answer = 99;
            }
            
            else
                answer = i;
        }
        
        System.out.println(answer + count);
        
    }
    
    static boolean dibool(int num)
    {
        boolean ap = true;
        int[] palan = {};
        int count = 1;
        int temp = num;
        
        while(num / 10 != 0)
        {
            num /= 10;
            count++;
        }
        
        palan = new int[count];
        num = temp;
        
        for(int i = 0; i < count; i++)
        {
            palan[i] = num % 10;
            num /= 10;
        
        }
        
        for(int i = 0; i < count - 2; i++)
        {
            if((float)palan[i + 1] != (float)(palan[i] + palan[i + 2]) / 2)
                ap = false;
        }
        
        return ap;
    }
    
}
