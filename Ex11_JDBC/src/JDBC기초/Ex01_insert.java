package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex01_insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "12345";
			
			Connection conn=DriverManager.getConnection(url, user, pw);
			
			if(conn != null) {
				System.out.println("연결성공!!");
			}else {
				System.out.println("연결실패..");
			}
			
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
			
			PreparedStatement psmt=conn.prepareStatement(sql);
			
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
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
