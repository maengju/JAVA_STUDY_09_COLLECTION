package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukServiceDB {
	Scanner scan = new Scanner(System.in);
	private List<SungJukDTO> list;

	public SungJukServiceDB() {
		list = new ArrayList<SungJukDTO>();

	}

	// 메뉴
	public void menu() {
		int num;
		while (true) {
			System.out.println();
			System.out.println("*****************\r\n" + "   1. 입력\r\n" + "   2. 출력\r\n" + "   3. 검색\r\n"
					+ "   4. 삭제\r\n" + "   5. 정렬\r\n" + "   6. 끝\r\n" + "*****************");

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

	private void insertArticle() {
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

		SungJukDTO sjd = new SungJukDTO(sn, name, kor, eng, math);
		sjd.calc();

		// DB
		SungJukDAO sjDAO = new SungJukDAO();
		sjDAO.insertArticle(sjd);

		System.out.println("등록완료");

	}// insertArticle

	private void printArticle() {
		System.out.println();
		SungJukDAO sjDAO = new SungJukDAO();
		List<SungJukDTO> list = sjDAO.printArticle();

		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");

		for (SungJukDTO sjd : list) {
			System.out.println(sjd);
		}

	}// printArticle()

	private void searchArticle() {
		int sn;

		System.out.print("검색 할 번호 입력 : ");
		sn = scan.nextInt();

		SungJukDAO sjDAO = new SungJukDAO();
		SungJukDTO sjd = sjDAO.searchArticle(sn);

		if (sjd != null) {
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println(sjd);
		} else
			System.out.println("찾는 번호가 없습니다.");

	}// searchArticle

	private void deleteArticle() {
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();

		SungJukDAO sjDAO = new SungJukDAO();
		int su = sjDAO.deleteArticle(name);
		
		if(su==0)System.out.println("찾는 이름이 없습니다.");
		else System.out.println("삭제 완료");
	}

	private void sortArticle() {
		int num;
		SungJukDAO sjDAO = new SungJukDAO();
		String sql = null;

		while (true) {
			System.out.println();
			System.out.println("1. 이름으로 오름차순\r\n" + "2. 총점으로 내림차순\r\n" + "3. 이전메뉴");
			System.out.print("번호 입력 : ");
			num = scan.nextInt();

			if (num == 3)
				break;
			
			List<SungJukDTO> list = sjDAO.sortArticle(num);
			
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");

			for (SungJukDTO sjd : list) {
				System.out.println(sjd);
			}
			
			
			
		}//while

	}//sortArticle()

}// class end
