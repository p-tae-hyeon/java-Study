package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// 여러 회원들의 정보를 관리할 수 있는 프로그램 만들기

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		while (true) {
			// 사용자가 볼 ui만들어주기

			System.out.println("[1]회원가입\t[2]로그인  \t[3]점수수정\t[4]회원탈퇴\t[5] 종료");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("================회원가입================");

				System.out.print("아이디 >>");
				String id = sc.next();
				System.out.print("비밀번호 >>");
				String pw = sc.next();
				System.out.print("이름 >>");
				String name = sc.next();
				System.out.print("나이 >>");
				int age = sc.nextInt();
				System.out.print("점수 >>");
				int score = sc.nextInt();

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "hr";
					String dbPW = "12345";
					conn = DriverManager.getConnection(url, user, dbPW);

					// sql 문장에 사용자가 입력한 데이터 값 연결하기 -> ?

					String sql = "INSERT INTO CLOUDMEMBER VALUES(?,?,?,?,?)";

					psmt = conn.prepareStatement(sql);

					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setString(3, name);
					psmt.setInt(4, age);
					psmt.setInt(5, score);

					int cnt = psmt.executeUpdate();

					if (cnt > 0) {
						System.out.println("회원가입을 성공하였습니다");
						System.out.println("축하합니다~!");
					} else {
						System.out.println("회원가입을 실패하셨습니다.");
						System.out.println("다시한번 확인해주세요");
					}

				} catch (ClassNotFoundException e) {
					System.out.println("클래스 못찾음");
				} catch (SQLException e) {
					System.out.println("SQL문 틀렸음");
				} finally {

					try {
						if (psmt != null) {
							psmt.close();
						}
						if (conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

				}

			} else if (choice == 2) {
				System.out.println("================로그인=================");
				System.out.println();
				System.out.print("아이디를 입력해주세요 >>");
				String id = sc.next();
				System.out.print("비밀번호를 입력해주세요 >>");
				String pw = sc.next();

				try {
					// 드라이버 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// DB연결

					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String dbID = "hr";
					String dbPW = "12345";

					conn = DriverManager.getConnection(url, dbID, dbPW);

					// SQL 전송

					String sql = "SELECT ID FROM CLOUDMEMBER WHERE ID= ? AND PW = ? ";

					psmt = conn.prepareStatement(sql);

					psmt.setString(1, id);
					psmt.setString(2, pw);

					rs = psmt.executeQuery();

					if (rs.next() == true) {
						String result = rs.getString("ID");
						System.out.println("로그인 성공!!");
						System.out.println(result + "님 환영합니다");
					} else {
						System.out.println("로그인 실패..");
					}

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
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

			}else if(choice ==3) {
				
			}else if(choice ==4) {
				
			}else if(choice ==5) {
				break;
			}else {
				System.out.println("1~5 사이의 숫자를 입력해주세요");
			}
			

		}

	}

}
