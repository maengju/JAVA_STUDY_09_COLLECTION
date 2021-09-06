package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain2 {

	public static void main(String[] args) {

		ArrayList <String>list = new ArrayList<String>();
		//ArrayList list = new ArrayList(); 간단하게 쓸려면 이렇게
		list.add("tiger");
		list.add("lion");
		list.add("tiger");//중복허용,순서
		//coll.add(25);
		//coll.add(43.8);
		list.add("기린");
		list.add("코끼리");
		
		
		
		Iterator it = list.iterator();//생성 	//지정자
		//it.hasNext()// 현재 위치에 항목이 있으면 True,없으면 False
		//it.next()//현재 위치의 항목을 꺼내주고 다음으로 이동
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		for(String data : list) {
			System.out.println(data);
		}//확장 for
	}
	

}
