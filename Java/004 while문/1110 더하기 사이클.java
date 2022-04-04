import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        // 입력하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = num;
        int temp1 = 0;
        int temp2 = 0;
        int count = 0;
        sc.close();
        
        // 출력하기
        while(true)
        {
            temp1 = num % 10;
            temp2 = num / 10 + temp1;
            // System.out.println(temp2);
            num = temp1 * 10 + temp2 % 10;
            count++;
            if(answer == num)break;
            
        }
        System.out.println(count);
    }
    
}
