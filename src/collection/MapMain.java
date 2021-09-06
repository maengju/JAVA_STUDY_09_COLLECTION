package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>(); //<> 안에 앞에가 key 뒤에가 value Spring에서 많이씀
		
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");//Value중복허용
		map.put("book301", "피오나");
		map.put("book101", "'엄'지공주");//key 중복허용 ( 그러나 나중에 나온걸로 덮어쓴다.)
		
		
		System.out.println(map.get("book102"));
		System.out.println(map.get("book103")); // key값이 없어도 에러가 안나고 null로 떨어진다.(if로 구분가능)
		System.out.println(map.get("book101"));

	}

}
