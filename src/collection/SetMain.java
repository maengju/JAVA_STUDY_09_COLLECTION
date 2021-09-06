package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
//set과 collection 차이점 set은 중복이 허용이 안되고 순서도 지맴대로
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("tiger");
		set.add("lion");
		set.add("tiger");
		set.add("기린");
		set.add("코끼리");
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
