import java.util.*;
/*
 *�˷����ɽ���������⣬����쳲������������� 
 * */
public class StringTest {
	
	static {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
  
     LinkedList<String> aa = new LinkedList<String>();
//     Set<String> bb= new HashSet<String>();
     Set<String> bb= new TreeSet<String>();
     bb.add("30 ����  ");
     bb.add("32 ����  ");
     bb.add("31 ����  ");
     bb.add("32 ����  ");
     
     System.out.println(bb);
     aa.addFirst("1");
     aa.add("2");
     aa.addLast("3");
     System.out.println(aa);
      
      
  
}
	
	
	
}

