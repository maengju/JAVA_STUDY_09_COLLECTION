package collection;

class GenericTest2<T> {
	private T a;
	
	public GenericTest2(T a) {
		this.a = a;
		
	}
	
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
	
	
}


//=========================================
public class GenericMain2 {

	public static void main(String[] args) {
		
		GenericTest2<?> aa = new GenericTest2<String>("홍길동"); //물음표를 넣으면 오브젝트와 됨
		//aa.setA("홍길동") - error 물음표를 사용하면 반드시 생성자를 통해서만 전달된다
		
		String name = (String)aa.getA();
		System.out.println("이름은 "+name);
		
		GenericTest2<?> bb = new GenericTest2<Integer>(25);
		int age = (Integer)bb.getA(); //AutoUnBoxing 객체형이 알아서 기본형으로 가는것.
		System.out.println("나이는 "+age);
		
	}

}
