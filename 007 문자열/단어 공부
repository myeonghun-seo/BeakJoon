import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        char answer = '0';
        
        String s = sc.next();
        int[] abc = new int[26];
        int top = 0;
        
        sc.close();
        
        s = s.toUpperCase();
        

        for(int i = 0; i < s.length(); i++)
        {
            abc[s.charAt(i) - 'A']++;
        }
        
        for(int i = 0; i < abc.length; i++)
        {
            if(abc[top] < abc[i])
                top = i;
        }
        
        answer = (char)top;
        answer += 'A';
        
        for(int i = 0; i < abc.length; i++)
        {
            if(top == i)
                continue;
                
            if(abc[top] == abc[i])
                answer = '?';
        }
        
        System.out.print(answer);
        
    }
    
}
