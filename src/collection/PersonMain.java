package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PersonMain {

	public ArrayList<PersonDTO> init() {
		
		
		PersonDTO aa = new PersonDTO("ȫ�浿",25);
		PersonDTO bb = new PersonDTO("���̾�",30);
		PersonDTO cc = new PersonDTO("����ġ",28);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list ;
		
	}//init()


	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		//ȣ��
		ArrayList<PersonDTO> list = pm.init();
		
		System.out.println("list = "+ list); // [~~~] // list�� �Ǹ鼭 �ּ��� ���� �����
		
		for(int i = 0;  i<list.size(); i++) {
			System.out.println(list.get(i).getName() + "\t"+ list.get(i).getAge());
		}
		
		System.out.println();
		
		for( PersonDTO data : list) {
			System.out.println("�̸�  "+ data.getName()+"\t���� "+data.getAge());
			
		}
		
		System.out.println();
		
	}

}
