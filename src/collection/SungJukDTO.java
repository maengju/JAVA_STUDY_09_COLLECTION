package collection;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO>{
	private int sn;
	private String name;
	private int kor,eng,math,tot;
	private double avg;
	
	private DecimalFormat df = new DecimalFormat("#.##");
	
	
	public SungJukDTO() {
		
	}
	
	public SungJukDTO(int sn, String name, int kor, int eng, int math) {
		this.sn = sn;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	public void calc() {
		tot = kor+eng+math;
		
		avg = (double)tot/3;
	
	}
	
	

	
	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int compareTo(SungJukDTO dto) {
		//내림차순
		if(this.tot< dto.tot) return 1;
		else if (this.tot== dto.tot) return 0;
		else return -1;
	}
	
	
	@Override
	public String toString() {
		
		return sn+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+df.format(avg);
	}

	
	
}
