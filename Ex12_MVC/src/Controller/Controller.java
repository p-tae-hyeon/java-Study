package Controller;

import java.util.ArrayList;

import Model.DAO;
import Model.MemberVO;

public class Controller {
	
	DAO dao = new DAO();
	int result = 0;
	String rsStr = null;
	ArrayList<MemberVO> rsSelAll;
	
//	// vo에 값 넣어주기
//	public MemberVO VOData(String id, String pw, String name, int age, int score) {
//		MemberVO vo = new MemberVO(id,pw,name,age,score);
//		
//		return vo;
//	}
	
	
	// 회원가입
	public int contInsert(MemberVO vo) {
		// model DAO에 전달
		result = dao.insert(vo);
		return result;
	}
	// 로그인
	public String contSelect(MemberVO vo) {
		rsStr=dao.select(vo);
		return rsStr;
	}
	// 수정
	public int contUpdate(MemberVO vo) {
		result = dao.update(vo);
		return result;
	}
	// delete
	public int contDelete(MemberVO vo) {
		result = dao.delete(vo);
		return result;
	}
	// selectAll
	public ArrayList<MemberVO> contSelectAll(){
		rsSelAll = dao.selectAll();
		return rsSelAll;
	}
	
	
	
	
	
	
	
	
	
	
}
