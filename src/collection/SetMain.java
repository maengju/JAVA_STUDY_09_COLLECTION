package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
//set�� collection ������ set�� �ߺ��� ����� �ȵǰ� ������ ���ɴ��
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("tiger");
		set.add("lion");
		set.add("tiger");
		set.add("�⸰");
		set.add("�ڳ���");
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
