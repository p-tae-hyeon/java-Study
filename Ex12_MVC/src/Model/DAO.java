package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	// DAO -> Data Access Object
	// 실제 데이터들이 DB에 접근할 수 있도록 기능을 정리하는 곳

	// 1. 드라이버 로딩
	// 2. DB 연결
	// 3. sql문장 전송
	// 4. 객체 반납

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int result;

	// 드라이버 및 DB연결
	public void getCon() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 객체 반납 기능
	public void getClose() {
		
		try {
			if(rs!=null) {
				rs.close();				
			}
			if(psmt!=null) {
				psmt.close();				
			}
			if(conn!=null) {
				conn.close();				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 회원가입 기능
	public int insert(MemberVO vo) {
		getCon();
		// sql 전송
		String sql = "INSERT INTO CLOUDMEMBER VALUES(?,?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			psmt.setInt(5, vo.getScore());
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return result;
	}
	
	// 로그인
	public String select(MemberVO vo) {
		getCon();
		String sql = "SELECT ID FROM CLOUDMEMBER WHERE ID = ? AND PW =?";
		String result = null;
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				result= rs.getString("id");
			}else {
				result = null;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return result;
	}
	
	// 점수 수정
	public int update(MemberVO vo) {
		getCon();
		String sql = "UPDATE CLOUDMEMBER SET SCORE =? WHERE ID=? AND PW =?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getScore());
			psmt.setString(2, vo.getId());
			psmt.setString(3, vo.getPw());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return result;
	}
	// 탈퇴
	public int delete(MemberVO vo) {
		getCon();
		String sql = "DELETE FROM CLOUDMEMBER WHERE ID=? AND PW =?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return result;
	}
	
	// 전체 정보 조회
	public ArrayList<MemberVO> selectAll(){
		getCon();
		String sql ="SELECT * FROM CLOUDMEMBER";
		ArrayList<MemberVO> arr = new ArrayList<MemberVO>();
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				MemberVO vo = new MemberVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
				arr.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
