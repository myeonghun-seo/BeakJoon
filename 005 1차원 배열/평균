import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        // 입력하기
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        int num = sc.nextInt();
        double[] su = new double[num];
        double avg = 0;
        double max;
        
        for(int i = 0; i < num; i++)
        {
            su[i] = sc.nextDouble();
        }
        
        sc.close();
        
        // 출력하기
        
        Arrays.sort(su);
        
        max = su[su.length - 1];
        
        for(int i = 0; i < su.length; i++)
        {
            su[i] = su[i] / max * 100;
            //su[i] = Math.round(su[i] * 100) / 100.0;
            avg += su[i];
            // System.out.println(su[i]);
        }
        
        avg /= su.length;
        //avg = Math.round(avg * 100) / 100.0;
        
        System.out.println(avg);
        
    }
    
}
