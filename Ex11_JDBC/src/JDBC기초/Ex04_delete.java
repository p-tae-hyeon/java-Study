package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04_delete {

	public static void main(String[] args) {

		System.out.println("회원정보삭제 기능 실행");

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

			// 3. SQL문 전송

			String sql = "DELETE FROM CLOUDMEMBER WHERE ID=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("성공");
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
