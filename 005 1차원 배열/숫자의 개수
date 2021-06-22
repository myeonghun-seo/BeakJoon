import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        // 입력하기
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int abc = a * b * c;
        int[] answer = new int[10];
        
        sc.close();
        
        String sabc = Integer.toString(abc);
        
        // 출력하기
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < sabc.length(); j++)
            {
                if(i == sabc.charAt(j) - '0')
                    answer[i]++;
            }
            
            System.out.println(answer[i]);
            
        }
     
    }
    
}
