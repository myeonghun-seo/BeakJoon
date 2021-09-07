import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        // 입력하기
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        int[] a = new int[10];
        int[] div42 = new int[10];
        int count = 1;
        
        for(int i = 0; i < 10; i++)
        {
            a[i] = sc.nextInt();
            div42[i] = a[i] % 42;
        }
        
        sc.close();
        
        // 출력하기
        
        Arrays.sort(div42);
        
        for(int i = 0; i < div42.length - 1; i++)
        {
            if(div42[i] != div42[i + 1])
                count++;
        }
        
        System.out.println(count);
        
    }
    
}
