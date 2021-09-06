package collection;

public class Boxing {

	public static void main(String[] args) {
		int a  = 25 ; //기본형
		//double b = a ; //타입이 틀리지만 같은 기본형이고 double이 더 크기때문에 가능
		double b = (double)a / 3 ; //앞은 강제 형변환 / 뒤에는 자동형변환(3 -> 3.0)
		
		String c =  "25";
		//int d = (int)c; - error
		int d = Integer.parseInt(c);
		
		int e = 5;
		Integer f = e ; // AutoBoxing JDK5.0부터 가능
		//Integer f = new Integer(e) //JDK 5.0이전
		
		Integer g = 5;
		int h = g; // AutoUnBoxing
		//int h = g.intValue(); - JDK 5.0이전에 사용
		
		
		
	
	}
}
