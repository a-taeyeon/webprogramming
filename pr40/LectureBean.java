/* 컴퓨터학과 20180981 안태연 (크롬최적화) */
package jspbook.pr40;

public class LectureBean {
	private int type;
	private int title;
	private int day;
	private int time;
	private int consecutive;
	
	public static final String[] typeNames = {"전공필수", "전공선택", "교양", "자유선택"};
	public static final String[] titleNames = {	
			"웹프로그래밍", "운영체제", "소프트웨어프로그래밍", "데이터베이스개론",
			"자료구조", "네트워크", "창의와감성", "사회봉사"
	};
	public static final String[] dayNames = {"월", "화", "수", "목", "금"};
	
	
	public LectureBean() {
		type = -1;
		title = -1;
		day = -1;
		time = -1;
		consecutive = -1;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getConsecutive() {
		return consecutive;
	}

	public void setConsecutive(int consecutive) {
		this.consecutive = consecutive;
	}
	
	public String toString() {
		String str = "";
		
		str = typeNames[getType()] + "/" + titleNames[getTitle()] + "/" + dayNames[getDay()] + "/" + getTime() + "/" + getConsecutive();
		
		return str;
	}
}