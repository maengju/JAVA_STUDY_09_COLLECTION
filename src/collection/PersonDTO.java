package collection;

public class PersonDTO implements Comparable<PersonDTO>{ //������ ���̷� ��Ʈ
	private String name;
	private int age;
	
	public PersonDTO(String name,int age) {
		
		this.name = name;
		this.age = age;
		
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(PersonDTO dto) {
		//��������
//		if(this.age< dto.age) return -1;
//		else if (this.age== dto.age) return 0;
//		else return 1;
		
		//��������
		if(this.age< dto.age) return 1;
		else if (this.age== dto.age) return 0;
		else return -1;
	}
	
	@Override
	public String toString() {
		
		return name+"  "+age; // Ŭ@16���� �� ����
	}

}
