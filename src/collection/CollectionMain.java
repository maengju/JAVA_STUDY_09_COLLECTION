package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {

		
		@SuppressWarnings({"rawtypes","unchecked"})//���� (��� ���ذ����� �ذ�x)
		//@SuppressWarnings("all")
		Collection coll = new ArrayList();
		//ArrayList list = new ArrayList(); �����ϰ� ������ �̷���
		coll.add("tiger");
		coll.add("lion");
		coll.add("thiger");//�ߺ����,����
		coll.add(25);
		coll.add(43.8);
		coll.add("�⸰");
		coll.add("�ڳ���");
		//������� �׾����� ������ Ÿ���� ���������� �Ҿ��̶�� �˷��ִ°�
		
		Iterator it = coll.iterator();//���� 	//������
		//it.hasNext()// ���� ��ġ�� �׸��� ������ True,������ False
		//it.next()//���� ��ġ�� �׸��� �����ְ� �������� �̵�
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
