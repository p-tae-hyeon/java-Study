package Model;

public class MemberVO {

	// VO -> Value Object = 설계도 클래스
	// 사용해야하는 DB의 테이블을 정리하는 곳!!

	private String id;
	private String pw;
	private String name;
	private int age;
	private int score;

	public MemberVO(String id, String pw, String name, int age, int score) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	

	public MemberVO() {
		// TODO Auto-generated constructor stub
	}



	



	public MemberVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}



	public MemberVO(String id, String pw, int score) {
		this.id = id;
		this.pw = pw;
		this.score = score;
	}



	public MemberVO(String id) {
		this.id = id;
	}



	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}

}
