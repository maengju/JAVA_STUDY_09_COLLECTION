package collection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SungJukService {

	Scanner scan = new Scanner(System.in);
	private List<SungJukDTO> list;

	// 생성
	public SungJukService() {
		list = new ArrayList<SungJukDTO>();

	}

	// 메뉴
	public void menu() {
		int num;
		while (true) {
			System.out.println();
			System.out.println("*****************\r\n" 
						+ "   1. 입력\r\n" 
						+ "   2. 출력\r\n" 
						+ "   3. 검색\r\n"
						+ "   4. 삭제\r\n" 
						+ "   5. 정렬\r\n" 
						+ "   6. 끝\r\n" 
						+ "*****************");

			System.out.print("번호 입력 : ");
			num = scan.nextInt();

			if (num == 6)
				break;

			if (num == 1)
				insertArticle();
			else if (num == 2)
				printArticle();
			else if (num == 3)
				searchArticle();
			else if (num == 4)
				deleteArticle();
			else if (num == 5)
				sortArticle();
			else
				System.out.println("1~6중에 선택하세요");

		} // while
	}// menu()

	// 입력
	public void insertArticle() {
		int sn, kor, eng, math;
		String name;
		
		System.out.println();
		System.out.print("번호 입력 : ");
		sn = scan.nextInt();
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		math = scan.nextInt();
		
		System.out.println();
		System.out.println("등록완료");

		
		SungJukDTO sjd = new SungJukDTO(sn, name, kor, eng, math);
		sjd.calc();
		list.add(sjd);
	}//insertArticle

	// 출력
	public void printArticle() {

		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		// System.out.println(list);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getSn() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor() + "\t"
//					+ list.get(i).getEng() + "\t" + list.get(i).getMath() + "\t" + list.get(i).getTot() + "\t"
//					+ list.get(i).getAvg() + "\t");
//		}
		for( SungJukDTO sjd  : list) {
			System.out.println(sjd);
		}

	}//printArticle

	// 검색
	public void searchArticle() {
		String name;
		int i;
		int count = 0;
		System.out.print("검색 할 이름 입력 : ");
		name = scan.next();
//		for (i = 0; i < list.size(); i++) {
//			if (list.get(i).getName().equals(name)) {
//				System.out.println(list.get(i).getSn() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor()
//						+ "\t" + list.get(i).getEng() + "\t" + list.get(i).getMath() + "\t" + list.get(i).getTot()
//						+ "\t" + list.get(i).getAvg() + "\t");
//				count++;
//			}
//		} // for
		
		for (SungJukDTO sjd : list) {
			if(name.equals(sjd.getName())) {
				if(count==0)System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sjd);
				count=1;
			}
		}
		if (count == 0)
			System.out.println("찾고자 하는 이름이 없습니다.");
	}// searchArticle

	
	// 삭제
	public void deleteArticle() {
		String name;
		int i;
		System.out.print("삭제 할 이름 입력 : ");
		name = scan.next();
		int sw =0;

		Iterator<SungJukDTO> it = list.iterator(); // iterator생성
		while(it.hasNext()) {
			SungJukDTO sjd = it.next();
			if(sjd.getName().equals(name)) {
				it.remove();  //it가 가리키는 현재위치를 지우는것이 아니라  바로 위에서 꺼내놓은 DTO를 지운다
				sw=1;
			}
		
		}//while

		if(sw==0) System.out.println("찾고자 하는 이름이 없습니다.");
		else System.out.println("데이터를 삭제하였습니다.");
	}// deleteArticle

	
	// 정렬
	public void sortArticle() {
		int num;
		

		while(true) {
			System.out.println();
			System.out.println("1. 이름으로 오름차순\r\n" + "2. 총점으로 내림차순\r\n" + "3. 이전메뉴");
			System.out.print("번호 입력 : ");
			num = scan.nextInt();
			if (num == 3)
				break;

			if (num == 1) { // 이름으로 오름차순

				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}
				};

				Collections.sort(list, com);
				printArticle();
			}

			else if (num == 2) {// 총점으로 내림차순
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						
						//조건연산자
						return dto1.getTot() < dto2.getTot() ? 1 :-1;

					}
				};
				Collections.sort(list,com);
				printArticle();
			} else
				System.out.println("1~3중에 선택하세요");
			
			
			
		}//while
		
		

	}// sortArticle

}
