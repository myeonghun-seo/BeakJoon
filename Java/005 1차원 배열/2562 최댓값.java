import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        // 입력하기
        Scanner sc = new Scanner(System.in);
        
        int[] answer = new int[9];
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < 9; i++)
        {
            answer[i] = sc.nextInt();
        }
        
        sc.close();
        
        // 출력하기
        for(int i = 0; i < 9; i++)
        {
            if(max < answer[i])
            {
                max = answer[i];
                count = i;
            }
        }
        
        System.out.println(max);
        System.out.println(count+1);
        
    }
    
}
