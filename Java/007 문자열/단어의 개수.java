import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String S = in.nextLine();
		in.close();
        
		StringTokenizer st = new StringTokenizer(S," ");
        
		System.out.println(st.countTokens());		
		
	}
    
}
