package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain2 {

	public static void main(String[] args) {

		ArrayList <String>list = new ArrayList<String>();
		//ArrayList list = new ArrayList(); �����ϰ� ������ �̷���
		list.add("tiger");
		list.add("lion");
		list.add("tiger");//�ߺ����,����
		//coll.add(25);
		//coll.add(43.8);
		list.add("�⸰");
		list.add("�ڳ���");
		
		
		
		Iterator it = list.iterator();//���� 	//������
		//it.hasNext()// ���� ��ġ�� �׸��� ������ True,������ False
		//it.next()//���� ��ġ�� �׸��� �����ְ� �������� �̵�
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		for(String data : list) {
			System.out.println(data);
		}//Ȯ�� for
	}
	

}
