package chapter01;

public class Ex08ArighmaticOperator {

	public static void main(String[] args) {
		final int TIME = 20000; // 20000초
		int hour = TIME/3600;
		int minutes = (TIME / 60) % 60;
		int seconds = TIME % 60;
		System.out.println(TIME +"초는" + hour +"시간" + minutes + "분" + seconds + "초 입니다.");
		
		
	}

}
