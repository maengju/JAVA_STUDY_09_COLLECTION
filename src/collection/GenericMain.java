package collection;

class GenericTest<T>{
	private T a;
	
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
	
}


//=========================================

public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa= new GenericTest<String>();
		
		aa.setA("으아악");
		System.out.println("이름은 "+aa.getA());
		
		//aa.setA(25); - error

		
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(28);
		System.out.println("나이는 "+bb.getA());
	}

}
