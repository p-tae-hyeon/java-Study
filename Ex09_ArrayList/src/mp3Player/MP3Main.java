package mp3Player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MP3Main {

	public static void main(String[] args) {
		// 1. 노래 재생시킬 도구 가져오기 => MP3Player
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);

		// 2. 객체배열 생성 (필드채워서 만들기)
		ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();

		// 3. 객체 생성
		String comPath = "C:\\Users\\smhrd\\Desktop\\Java Study\\Ex09_ArrayList\\player\\";
		MusicVO vo1 = new MusicVO("How sweet", "New Jeans", 120, comPath + "How Sweet.mp3");
		MusicVO vo2 = new MusicVO("Small girl", "이영지", 180, comPath + "Small girl.mp3");
		MusicVO vo3 = new MusicVO("Sticky", "Kiss Of Life", 180, comPath + "Sticky.mp3");
		MusicVO vo4 = new MusicVO("Supernova", "asepa", 120, comPath + "Supernova.mp3");
		MusicVO vo5 = new MusicVO("클락션(klaxon)", "아이들", 120, comPath + "클락션(Klaxon).mp3");
		musicList.add(vo1);
		musicList.add(vo2);
		musicList.add(vo3);
		musicList.add(vo4);
		musicList.add(vo5);
		
		int i =0;
		System.out.println("====== MP3Player ====== ");
		while (true) {
			System.out.println("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====== 재생 ======");
				
				if (mp3.isPlaying()) {
					System.out.println("이미 재생중입니다.");
				} else {
					mp3.play(musicList.get(i).getPath());
					System.out.println("노래이름 : "+musicList.get(i).getTitle());
					System.out.println("가수이름 : "+musicList.get(i).getSinger());
				}
				
			} else if (choice == 2) {
				System.out.println("====== 정지 =======");
				// 노래 정지 메소드
				// mp3.stop
				// 노래가 재생중이라면 정지하고 노래 재생을 정지합니다. 출력
				// 노래가 재생중이지 않다면 재생중인 노래가 없습니다! 출력
				if (mp3.isPlaying()) {
					mp3.stop();
					System.out.println("노래 재생을 정지합니다.");
				} else {
					System.out.println("재생중인 노래가 없습니다!");
				}

			} else if (choice == 3) {
				System.out.println("====== 이전곡 ======");
				// 1. 노래 재생중인지 여부를 판단
				if(mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				// 3. 뮤직 플레이리스트의 이전곡 재생
				i--;
				if(i >= 0) {
					// 4. 가수 - 노래 제목 이 재생중입니다. 출력하기
					mp3.play(musicList.get(i).getPath());
					System.out.println(musicList.get(i).getSinger() 
							+ "-" + musicList.get(i).getTitle());
				}else {
					// 5. 단, 이전곡이 없다면 이전곡이 없습니다.를 출력
					// --> 다시 재생을 선택하면 뮤직플레이 리스트의 첫번째 곡이 재생되게 만들기
					System.out.println("이전곡이 없습니다.");
					i = 0;
				}
				
				
			} else if (choice == 4) {
				System.out.println("====== 다음곡 ======");
				// 1. 노래가 재생중인지 여부를 판단
				if(mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				// 3. 뮤직 플레이리스트(ArrayList)의 다음곡 재생
				// ex) i = 0 --> 1 / 1 --> 2
				i++;
				if(i < musicList.size()) {
					// 4. 가수 - 노래 제목 이 재생중입니다. 출력하기
					// ex) 뉴진스 - How Sweet 이(가) 재생중입니다.
					mp3.play(musicList.get(i).getPath());
					System.out.println(musicList.get(i).getSinger() 
							+ "-" + musicList.get(i).getTitle());
				}else {
					// 5. 단, 다음곡이 없다면 "다음곡이 없습니다."를 출력
					// --> 다시 재생을 선택하면 뮤직플레이 리스트의 마지막 곡이 재생되게 만들기
					// 우리 노래는 딱 5곡 있다는거 기억하기!!
					System.out.println("다음곡이 없습니다.");
					i = musicList.size()-1; // 가장 마지막 곡 번호로 초기화
				}
				
				
				
				
			} else if (choice == 5) {
				System.out.println("====== 종료 ======");
				if (mp3.isPlaying()) {
					mp3.stop();
					System.out.println("노래 재생을 정지합니다.");
				}
				break;
			} else {
				System.out.println("번호를 다시 입력해주세요~!");
			}
			
		}

	}

}
