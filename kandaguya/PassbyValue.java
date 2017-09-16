package kamdagiya;

public class PassbyValue {
	public static void main(String[] args) {
		//pass by value. 복사한다. (copy) <-자바에서는 모든것이 이것이다.
		//pass by reference <- c에서 주소의 이동
		
		int x = 0;//0이 복사되어
		show(x);
		System.out.println("======");
		System.out.println(x);
	}//복사된 0이 num으로 들어간다.
	public static void show(int num){
		num = 100;
		System.out.println(num);
	}
}
 