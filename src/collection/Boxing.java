package collection;

public class Boxing {

	public static void main(String[] args) {
		int a  = 25 ; //�⺻��
		//double b = a ; //Ÿ���� Ʋ������ ���� �⺻���̰� double�� �� ũ�⶧���� ����
		double b = (double)a / 3 ; //���� ���� ����ȯ / �ڿ��� �ڵ�����ȯ(3 -> 3.0)
		
		String c =  "25";
		//int d = (int)c; - error
		int d = Integer.parseInt(c);
		
		int e = 5;
		Integer f = e ; // AutoBoxing JDK5.0���� ����
		//Integer f = new Integer(e) //JDK 5.0����
		
		Integer g = 5;
		int h = g; // AutoUnBoxing
		//int h = g.intValue(); - JDK 5.0������ ���
		
		
		
	
	}
}
