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

	// ����
	public SungJukService() {
		list = new ArrayList<SungJukDTO>();

	}

	// �޴�
	public void menu() {
		int num;
		while (true) {
			System.out.println();
			System.out.println("*****************\r\n" 
						+ "   1. �Է�\r\n" 
						+ "   2. ���\r\n" 
						+ "   3. �˻�\r\n"
						+ "   4. ����\r\n" 
						+ "   5. ����\r\n" 
						+ "   6. ��\r\n" 
						+ "*****************");

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

	// �Է�
	public void insertArticle() {
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
		System.out.println("��ϿϷ�");

		
		SungJukDTO sjd = new SungJukDTO(sn, name, kor, eng, math);
		sjd.calc();
		list.add(sjd);
	}//insertArticle

	// ���
	public void printArticle() {

		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
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

	// �˻�
	public void searchArticle() {
		String name;
		int i;
		int count = 0;
		System.out.print("�˻� �� �̸� �Է� : ");
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
				if(count==0)System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
				System.out.println(sjd);
				count=1;
			}
		}
		if (count == 0)
			System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
	}// searchArticle

	
	// ����
	public void deleteArticle() {
		String name;
		int i;
		System.out.print("���� �� �̸� �Է� : ");
		name = scan.next();
		int sw =0;

		Iterator<SungJukDTO> it = list.iterator(); // iterator����
		while(it.hasNext()) {
			SungJukDTO sjd = it.next();
			if(sjd.getName().equals(name)) {
				it.remove();  //it�� ����Ű�� ������ġ�� ����°��� �ƴ϶�  �ٷ� ������ �������� DTO�� �����
				sw=1;
			}
		
		}//while

		if(sw==0) System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
		else System.out.println("�����͸� �����Ͽ����ϴ�.");
	}// deleteArticle

	
	// ����
	public void sortArticle() {
		int num;
		

		while(true) {
			System.out.println();
			System.out.println("1. �̸����� ��������\r\n" + "2. �������� ��������\r\n" + "3. �����޴�");
			System.out.print("��ȣ �Է� : ");
			num = scan.nextInt();
			if (num == 3)
				break;

			if (num == 1) { // �̸����� ��������

				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}
				};

				Collections.sort(list, com);
				printArticle();
			}

			else if (num == 2) {// �������� ��������
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						
						//���ǿ�����
						return dto1.getTot() < dto2.getTot() ? 1 :-1;

					}
				};
				Collections.sort(list,com);
				printArticle();
			} else
				System.out.println("1~3�߿� �����ϼ���");
			
			
			
		}//while
		
		

	}// sortArticle

}
