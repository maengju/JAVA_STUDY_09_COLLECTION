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

	// �޴�
	public void menu() {
		int num;
		while (true) {
			System.out.println();
			System.out.println("*****************\r\n" + "   1. �Է�\r\n" + "   2. ���\r\n" + "   3. �˻�\r\n"
					+ "   4. ����\r\n" + "   5. ����\r\n" + "   6. ��\r\n" + "*****************");

			System.out.print("��ȣ �Է� : ");
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
				System.out.println("1~6�߿� �����ϼ���");

		} // while
	}// menu()

	private void insertArticle() {
		int sn, kor, eng, math;
		String name;

		System.out.println();
		System.out.print("��ȣ �Է� : ");
		sn = scan.nextInt();
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("���� �Է� : ");
		kor = scan.nextInt();
		System.out.print("���� �Է� : ");
		eng = scan.nextInt();
		System.out.print("���� �Է� : ");
		math = scan.nextInt();

		System.out.println();

		SungJukDTO sjd = new SungJukDTO(sn, name, kor, eng, math);
		sjd.calc();

		// DB
		SungJukDAO sjDAO = new SungJukDAO();
		sjDAO.insertArticle(sjd);

		System.out.println("��ϿϷ�");

	}// insertArticle

	private void printArticle() {
		System.out.println();
		SungJukDAO sjDAO = new SungJukDAO();
		List<SungJukDTO> list = sjDAO.printArticle();

		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");

		for (SungJukDTO sjd : list) {
			System.out.println(sjd);
		}

	}// printArticle()

	private void searchArticle() {
		int sn;

		System.out.print("�˻� �� ��ȣ �Է� : ");
		sn = scan.nextInt();

		SungJukDAO sjDAO = new SungJukDAO();
		SungJukDTO sjd = sjDAO.searchArticle(sn);

		if (sjd != null) {
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
			System.out.println(sjd);
		} else
			System.out.println("ã�� ��ȣ�� �����ϴ�.");

	}// searchArticle

	private void deleteArticle() {
		System.out.print("���� �� �̸� �Է� : ");
		String name = scan.next();

		SungJukDAO sjDAO = new SungJukDAO();
		int su = sjDAO.deleteArticle(name);
		
		if(su==0)System.out.println("ã�� �̸��� �����ϴ�.");
		else System.out.println("���� �Ϸ�");
	}

	private void sortArticle() {
		int num;
		SungJukDAO sjDAO = new SungJukDAO();
		String sql = null;

		while (true) {
			System.out.println();
			System.out.println("1. �̸����� ��������\r\n" + "2. �������� ��������\r\n" + "3. �����޴�");
			System.out.print("��ȣ �Է� : ");
			num = scan.nextInt();

			if (num == 3)
				break;
			
			List<SungJukDTO> list = sjDAO.sortArticle(num);
			
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");

			for (SungJukDTO sjd : list) {
				System.out.println(sjd);
			}
			
			
			
		}//while

	}//sortArticle()

}// class end
