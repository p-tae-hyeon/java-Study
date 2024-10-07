package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex00_jdbc기초 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// JDBC(Java Database Connectivity)
		// : JDBC 인터페이스 사용방법!!
		
		// 1. 드라이버 로딩
		// JDBC 드라이버
		// : java에서 제공해주는 인터페이스들을 데이터베이스 회사에서
		// 상속을 받아서 로직을 구현한 클래스 파일들의 모음
		
		try {
			// try 구문
			// --> 예외(Exception)가 발생할 수도 있지만, 일단 시도해보는 구간
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// --> 반드시 jar파일 넣어주기!!!
			// jar파일이란??
			// --> 클래스 파일을 여러개 모아놓은 압축파일
			// 프로젝트에 jar파일 추가하는 방법
			// 프로젝트 선택 -> 마우스 우클릭 --> build path
			// -> configure build path -> libraries탭
			// -> class path선택 -> 우측에 있는 add external jars 버튼 클릭
			// -> 원하는 jar파일 경로 선택 -> apply and close
			// ojdbc파일 경로
			//  system(c) > oraclexe>app>oracle>product>11.2.0
			//  >server > jdbc> lib>ojdbc6.jar
			
			
			// 2. 데이터베이스 연결
			// 준비물 3가지
			// 1) 연결 경로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// JDBC 드라이버가 thin 타입
			// @localhost --> ip주소(127.0.0.1)
			// 1521 --> port번호
			// xe --> DB의 기본이름
			
			// 계정이름
			String user = "hr";
			
			// 계정 비밀번호
			String pw = "12345";
			
			Connection conn=DriverManager.getConnection(url, user, pw);
			// Connection=> interface임
			// : DB에 접속하기 위한 모든 메소드를 가진 인터페이스
			// ---> DB와 하는 모든 통신은 Connection을 통해서 이루어진다!
			// Connection == MetaData
			// --> 사용 가능한 테이블 목록, 컬럼들에 대한 정보 등
			// 연결된 데이터베이스의 모든 정보를 가지고 있음!!
			
			if(conn != null) {
				System.out.println("연결성공!!");
			}else {
				System.out.println("연결실패..");
			}
			// 3.Query(SQL문) 전송
			
			//String sql="INSERT INTO CLOUDMEMBER (ID,PW,NAME,AGE,SCORE)VALUES('SMHRD','12345','박지승',20,0)";
			System.out.print("id를 입력해주세요 >>");
			String id = sc.next();
			System.out.print("pw를 입력해주세요 >>");
			String password = sc.next();
			System.out.print("이름을 입력해주세요 >>");
			String name = sc.next();
			System.out.print("나이를 입력해주세요 >>");
			int age  =sc.nextInt();
			System.out.print("점수를 입력해주세요 >>");
			int score =sc.nextInt();
			String sql ="INSERT INTO CLOUDMEMBER VALUES(?,?,?,?,?)";
			
			// ?인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
			// : 지정한 데이터 공간만큼 비워놓고 실행하기 전까지 대기
			
			PreparedStatement psmt=conn.prepareStatement(sql);
			
			// ?인자 채우기
			// 데이터 바인딩 작업
			
			psmt.setString(1, id);
			psmt.setString(2, password);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.setInt(5, score);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt>0) {
				System.out.println("회원가입 성공!");
			}else {
				System.out.println("실패..");
			}
			
			// 4. 객체 반납
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			//catch (ClassNotFoundException | SQLException e)
			// ---> 모든 예외클래스는 Exception을 상속받는다!!
			// ---> Exception e = new ClassNotFoundException();
			// -->업캐스팅이 일어나는 개념
			// 좋은 방법은 아님!! 가장 좋은건 catch구문 밑에 catch구문 추가한것
			
			// catch구문
			// 예외가 발생했을 때, 어떤 로직을 수행할 지 작성하는 구간!!
			// ()안쪽에 있는 매개변수는, 어떤 예외를 잡아줄건지 기술하는 공간
			e.printStackTrace();
			// 예외상황이 왜 발생했고, 어디서 문제가 나고있는지 
			// 출력해주눈 구문! => 반드시 개발할때만 사용해야함!
			// ---> 나중에 배포할 때 꼭 삭제해야하는 구문
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
