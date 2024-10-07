package mp3Player;

public class MusicVO {
	
	// 설계도 
	// 뮤직 플레이어 안에서 사용할 자료형
	
	// 1. 필드
	// (1) 노래 데이터의 제목
	private String title;
	// (2) 가수
	private String singer;
	// (3) 재생시간
	private int playTime;
	// (4) 경로(파일이 저장되어있는 위치)
	private String path;
	
	
	
	// 2. 메소드(기능)
	// - 모든 필드를 채울 생성자
	public MusicVO(String title, String singer, int playTime, String path) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}
	// 데이터를 가지고 와줄 모든 필드에 대한 getter 



	public String getTitle() {
		return title;
	}



	public String getSinger() {
		return singer;
	}



	public int getPlayTime() {
		return playTime;
	}



	public String getPath() {
		return path;
	}
	
	
	
	

}
