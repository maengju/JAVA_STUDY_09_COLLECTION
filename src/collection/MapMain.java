package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>(); //<> �ȿ� �տ��� key �ڿ��� value Spring���� ���̾�
		
		map.put("book101", "�鼳����");
		map.put("book201", "�ξ����");
		map.put("book102", "�鼳����");//Value�ߺ����
		map.put("book301", "�ǿ���");
		map.put("book101", "'��'������");//key �ߺ���� ( �׷��� ���߿� ���°ɷ� �����.)
		
		
		System.out.println(map.get("book102"));
		System.out.println(map.get("book103")); // key���� ��� ������ �ȳ��� null�� ��������.(if�� ���а���)
		System.out.println(map.get("book101"));

	}

}
