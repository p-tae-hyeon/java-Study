package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_select {

	public static void main(String[] args) {

		System.out.println("로그인 기능 실행");

		// 1. 드라이버 로딩
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbID = "hr";
			String dbPW = "12345";

			conn = DriverManager.getConnection(url, dbID, dbPW);

			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 >>");
			String id = sc.next();
			System.out.print("비밀번호 >>");
			String pw = sc.next();

			// SQL 실행
			String sql = "SELECT ID FROM CLOUDMEMBER WHERE ID= ? AND PW = ? ";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			// ResultSet : 표(테이블) 형식의 자료구조 => 커서가 있음
			// -> 커서를 가지고 있다 -> 처음에는 컬럼명을 가르킴
			// -> 커서가 가르키고 있는 데이터들만 가지고 올 수 있다.

			// rs.next() -> 커서를 한행 아래로 내린다.
			if (rs.next() == true) {
				// rs.next()의 결과값이(리턴값이) true : 우리가 필요한 정보가 db에 있다.
				// -> 입력한 정보와 일치하는 정보가 db에 있다
				String result = rs.getString("ID");
				System.out.println("로그인 성공!!");
				System.out.println(result + "님 환영합니다");
			} else {
				System.out.println("로그인 실패..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. 객체 반납
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
