package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	
	public static void main(String[] args) {
		String [] ar = {"orange","apple","banana","pear","peach","applemango"};
		
		System.out.print("정렬 전 = ");
		for(String str : ar) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		
		System.out.print("정렬 후 = ");
		for(String str : ar) {
			System.out.print(str+" ");
		}
		
		System.out.println();
		
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("라이언",30);
		PersonDTO cc = new PersonDTO("어피치",28);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬전 ");
		System.out.println(list);
		System.out.println();
		
		System.out.print("나이로 오름차순(내림차순) : ");
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		System.out.println("이름으로 오름차순");
		
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() { // 기준이 이미있을대 다른기준을 써야할때
			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) {
				//오름차순
				//return dto1.getName().compareTo(dto2.getName());  // 문자열로 sort하기 위함
				
				//내림차순
				return dto2.getName().compareTo(dto1.getName());
			}
		
		};
		
		Collections.sort(list,com);
		System.out.println(list);
		System.out.println();
		
	}
	
	
}
