/*
 * �������� ���α׷�
1. ��ȣ, �̸�, ����, ����, ���������� �Է��Ͽ� ������ ����� ���Ͻÿ�
2. �� ��ɿ� ���� 3���� Ŭ������ ������ �ۼ��Ͻÿ�
   SungJukDTO.java
   SungJukService.java
   SungJukMain.java
3. ����� �Ҽ����� 2°�ڸ����� ���
   �Ҽ����� �ڸ����� 0�̸� ������� �ʴ´�
   ex) 92.000 �� 92�� ����Ͻÿ�
4. ��ȣ�� �ߺ����� �ʰ� �Է��Ѵ�.
5. �̸��� �ߺ��Ǿ �ȴ� (�Ȱ��� �̸��� �Է��ϼ���)
6. Comparable / Comparator�̰Ÿ� �ᵵ��
7. SungJukDTO���� toString�� Override�ؼ� ���ÿ�

menu()
*****************
   1. �Է�
   2. ���
   3. �˻�
   4. ����
   5. ����
   6. ��
*****************
   ��ȣ : 8
1~6�߿� �����ϼ���

insertArticle()
��ȣ �Է� :
�̸� �Է� :
���� �Է� :
���� �Է� :
���� �Է� :

 ��� �Ϸ�

printArticle()
��ȣ      �̸�      ����      ����      ����      ����      ���
15      ȫ�浿   90      92      91      xxx      xx.xx
30      ��ġ      85      92      100      xxx      xx.xx

searchArticle()
�˻� �� �̸� �Է� : �ڳ�
ã���� �ϴ� �̸��� �����ϴ�

�˻� �� �̸� �Է� : ȫ�浿
��ȣ      �̸�      ����      ����      ����      ����      ���
15      ȫ�浿   90      92      91      xxx      xx.xx
16      ȫ�浿   89      45      78      xxx      xx.xx

deleteArticle() - �Ȱ��� �̸��� ������ ��� ����
���� �� �̸� �Է� : ȫ�浿
�����͸� �����Ͽ����ϴ�

sortArticle()
1. �̸����� ��������
2. �������� ��������
3. �����޴�
 ��ȣ �Է� : 
 */


package collection;

public class SungJukMain {

	
	
	public static void main(String[] args) {
		//list�� ó��
//		SungJukService service = new SungJukService();
//		service.menu();
//		
		//DB�� ó��
		SungJukServiceDB serviceDB = new SungJukServiceDB();
		serviceDB.menu();
		System.out.println("���α׷� ����");
	}
}


/*
���̺�� : SungJuk
sn number unique(�ߺ����X), name varchar2(50) not null(�̸��� ���ָ� error) , kor number, eng number, 
math number ,tot number , avg number(5,2)
 
 */
