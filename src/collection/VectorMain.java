package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		System.out.println("���� ũ�� "+ v.size()); // 0 - �׸񰳽�
		System.out.println("���� �뷮 "+ v.capacity()); //10 - ���� ũ��
		System.out.println();
		
		
		System.out.println("�׸��߰� ");
		for (int i = 1; i<=10; i++) {
			v.add(i+"");
		}
		System.out.println();
		
		v.add("5"); //�ߺ����, ����
		
		System.out.println("���� ũ�� "+ v.size()); // 0 - �׸񰳽�
		System.out.println("���� �뷮 "+ v.capacity()); //10 - ���� ũ��
		System.out.println();
		
		
		for(int i = 0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		
		
		System.out.println();
		
		System.out.println("===�׸����===");
		v.remove("5"); // �տ��ִ� "5"�� ����
		v.removeElementAt(9); // �ڿ��ִ� 5�� ����
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		System.out.println();
		
		Vector <String>v2 = new Vector<String>(5,2);
		
		
	}

}
