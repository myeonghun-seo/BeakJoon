import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        // 입력하기
        Scanner sc = new Scanner(System.in);
        
        double answer = 0;
        int num1 = sc.nextInt();
        int num2 = 0;
        int count = 0;
        int[] jumsu = {};
        double avg = 0;
        
        for(int i = 0; i < num1; i++)
        {
            num2 = sc.nextInt();
            jumsu = new int[num2];
            
            for(int j = 0; j < num2; j++)
            {
                jumsu[j] = sc.nextInt();
                avg += jumsu[j];
            }
            
            avg /= num2;
            // System.out.println(avg);
            
            for(int j = 0; j < num2; j++)
            {
                if(avg < jumsu[j])
                    count++;
            }
            
            answer = (double)count / num2;
            
            System.out.printf("%.3f%%\n", answer * 100);
            
            answer = 0;
            count = 0;
            avg = 0;
        }
        
        sc.close();
        
    }
    
}
