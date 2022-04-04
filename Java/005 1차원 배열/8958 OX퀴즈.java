import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        // 입력하기
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        int count = 0;
        int num = sc.nextInt();
        String[] OX = new String[num];
        
        for(int i = 0; i < num; i++)
        {
            OX[i] = sc.next();
        }
        
        sc.close();
        
        // 출력하기
        
        for(int i = 0; i < OX.length; i++)
        {
            int sum = 0;
            
            for(int j = 0; j < OX[i].length(); j++)
            {
                if(OX[i].charAt(j) == 'O')
                {
                    count++;
                    sum += count;
                }
                
                else if(OX[i].charAt(j) == 'X')
                    count = 0;
                
            }
            
            count = 0;
            System.out.println(sum);
            
        }
        
    }
    
}
