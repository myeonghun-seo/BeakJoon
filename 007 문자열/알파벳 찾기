import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int[] answer = new int[26];
        String pas = sc.next();
        boolean[] trigger = new boolean[26];
        
        sc.close();
        
        for(int i = 0; i < answer.length; i++)
        {
            for(int j = 0; j < pas.length(); j++)
            {
                if(pas.charAt(j) == 'a' + i && !trigger[i])
                {
                    answer[i] = j;
                    trigger[i] = true;       
                }
                
            }
            
            if(!trigger[i])
                answer[i] = -1;
            
        }
        
        for(int i = 0; i < answer.length; i++)
        {
            if(i != 0)
                System.out.print(" ");
            System.out.print(answer[i]);
        }
        
    }
    
}
