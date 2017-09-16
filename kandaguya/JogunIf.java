/**
 * 조건 if
 */
package kamdagiya;

public class JogunIf {

	public void a() {

		int num = 0;

		if (num == 0) {
			System.out.println("correct!");
		} else if (num >= 1) {
			System.out.println("숫자는 1또는 1보다 큰수 입니다.");
		} else {
			System.out.println("나머지 경우의 수");
		}
	}

	public void b() {
		String name = "Rin";
		//num = 1;
		
		name = "Jo";
				if (name=="Rin"){ 
					System.out.println("이름이 맞습니다.");
				} else if (name == "Jo" ) {
					System.out.println("친구의 이름입니다.");
				} else {
					System.out.println("나ㅇ[");
				}
	}

	public static void main(String[] args) {
		// 메모 (주석)

		/*
		 * 어디까지인가?
		 */

		/**
		 * 주석처리
		 */

	}

}
