package oop실습;

public class SmartPhone {

	int messageCount;
	boolean power;
	int capacity;

	protected void recieveMessage() {
		System.out.println("메세지 받았습니다.");
		messageCount++;
	}

	private void voiceRecord(String inputVoice) {
		System.out.println("음성녹음시작.");
	}

	String showing(boolean power) {
		if (power) {
			return "on";
		} else {
			return "off";
		}

	}
	
	String arlet(int capacity) {
		if(capacity<10) {
			return "10%미만";
		}else {
			return "배터리 100";
		}
	}
	
	protected String playMusic() {
		return "음악재생중";
	}
	
}
