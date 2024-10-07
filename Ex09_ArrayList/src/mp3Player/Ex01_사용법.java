package mp3Player;

import javazoom.jl.player.MP3Player;

public class Ex01_사용법 {

	public static void main(String[] args) {
		// 노래를 재생시킬 도구를 가져오기 => MP3Player
		// jar파일
		
		MP3Player mp3 = new MP3Player();
		
		// 1. 재생하기
		mp3.play("C:\\Users\\smhrd\\Desktop\\Java Study\\Ex09_ArrayList\\player\\클락션(Klaxon).mp3");
		
		// 2. 노래 멈추기
		mp3.stop();
		mp3.play("C:\\Users\\smhrd\\Desktop\\Java Study\\Ex09_ArrayList\\player\\Small girl.mp3");
		
		// 노래가 재생되고 있는지 여부를 판단하는 메서드
//		mp3.isPlaying();
		// 노래가 재생되고 있다면 true 반환
		if(mp3.isPlaying()) {
			mp3.stop();
			mp3.play("C:\\Users\\smhrd\\Desktop\\Java Study\\Ex09_ArrayList\\player\\How Sweet.mp3");
		}
		
	}

}
