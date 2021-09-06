package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {

		
		@SuppressWarnings({"rawtypes","unchecked"})//억제 (경고를 없앤것이지 해결x)
		//@SuppressWarnings("all")
		Collection coll = new ArrayList();
		//ArrayList list = new ArrayList(); 간단하게 쓸려면 이렇게
		coll.add("tiger");
		coll.add("lion");
		coll.add("thiger");//중복허용,순서
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		//노란줄이 그어지는 이유는 타입이 여러가지라 불안이라고 알려주는것
		
		Iterator it = coll.iterator();//생성 	//지정자
		//it.hasNext()// 현재 위치에 항목이 있으면 True,없으면 False
		//it.next()//현재 위치의 항목을 꺼내주고 다음으로 이동
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
