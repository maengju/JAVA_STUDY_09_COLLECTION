package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PersonMain {

	public ArrayList<PersonDTO> init() {
		
		
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("라이언",30);
		PersonDTO cc = new PersonDTO("어피치",28);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list ;
		
	}//init()


	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		//호출
		ArrayList<PersonDTO> list = pm.init();
		
		System.out.println("list = "+ list); // [~~~] // list가 되면서 주소의 값이 변경댐
		
		for(int i = 0;  i<list.size(); i++) {
			System.out.println(list.get(i).getName() + "\t"+ list.get(i).getAge());
		}
		
		System.out.println();
		
		for( PersonDTO data : list) {
			System.out.println("이름  "+ data.getName()+"\t나이 "+data.getAge());
			
		}
		
		System.out.println();
		
	}

}
