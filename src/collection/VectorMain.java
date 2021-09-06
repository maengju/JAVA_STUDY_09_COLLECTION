package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		System.out.println("백터 크기 "+ v.size()); // 0 - 항목개스
		System.out.println("백터 용량 "+ v.capacity()); //10 - 백터 크기
		System.out.println();
		
		
		System.out.println("항목추가 ");
		for (int i = 1; i<=10; i++) {
			v.add(i+"");
		}
		System.out.println();
		
		v.add("5"); //중복허용, 순서
		
		System.out.println("백터 크기 "+ v.size()); // 0 - 항목개스
		System.out.println("백터 용량 "+ v.capacity()); //10 - 백터 크기
		System.out.println();
		
		
		for(int i = 0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		
		
		System.out.println();
		
		System.out.println("===항목삭제===");
		v.remove("5"); // 앞에있는 "5"를 삭제
		v.removeElementAt(9); // 뒤에있는 5를 삭제
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		System.out.println();
		
		Vector <String>v2 = new Vector<String>(5,2);
		
		
	}

}
