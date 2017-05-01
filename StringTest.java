import java.util.*;
/*
 *此方法可解决兔子问题，用于斐波那契数列问题 
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
     bb.add("30 张三  ");
     bb.add("32 李四  ");
     bb.add("31 王五  ");
     bb.add("32 李四  ");
     
     System.out.println(bb);
     aa.addFirst("1");
     aa.add("2");
     aa.addLast("3");
     System.out.println(aa);
      
      
  
}
	
	
	
}

