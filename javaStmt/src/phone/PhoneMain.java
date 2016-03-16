package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("=== 집전화기로 통화 ===");
	//	usePhone(s);
	//	useNokia(s);
	//	useIphone(s);
		useAndroid(s);
	}

	public static void useAndroid(Scanner s) {
		AndroidPhone android = new AndroidPhone();
		android.setCompany("안드로이드");
		System.out.println(android.getCompany()+"를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람, 전송할 메세지, 화면크기 ?");
		android.setData(s.next(),s.next(),s.next());
		System.out.println(android.getCall());
	}

	public static void useIphone(Scanner s) {
		IPhone iPhone = new IPhone();
		iPhone.setCompany("애플");
		System.out.println(iPhone.getCompany()+"를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람과 전송할 메세지 ?");
		iPhone.setData(s.next(),s.next());
		System.out.println(iPhone.getCall());
	}

	public static void useNokia(Scanner s) {
		Phone nokia = new CellPhone();
		//부모의 타입으로 자식의 생성자를 통해 인스턴스를 생성할 수 있다.
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany()+"를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람?");
		nokia.setCall(s.next());
		System.out.println(nokia.getCall());
	}

	public static void usePhone(Scanner s) {
		Phone phone = new Phone();
		phone.setCompany("삼성 집전화기");
		System.out.println(phone.getCompany()+"를 사용합니다.");
		System.out.println("통화할 사람?");
		phone.setCall(s.next());
		System.out.println(phone.getCall());
	}
}
