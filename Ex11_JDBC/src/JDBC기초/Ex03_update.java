package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03_update {

	public static void main(String[] args) {

		System.out.println("회원정보수정 기능 실행");

		Connection conn = null;
		PreparedStatement psmt = null;
		Scanner sc = new Scanner(System.in);

		// 1. 드라이버 로딩

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			System.out.print("아이디를 입력해주세요! >>");
			String id = sc.next();
			System.out.print("비밀번호를 입력해주세요! >>");
			String pw = sc.next();
			System.out.print("점수를 입력해주세요! >>");
			int score = sc.nextInt();

			// 3. SQL문 전송

			String sql = "UPDATE CLOUDMEMBER SET SCORE =? WHERE ID=? AND PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, score);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("수정성공");
			} else {
				System.out.println("실패...");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 4. 객체 반납
		finally {
			try {
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
