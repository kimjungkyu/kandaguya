package kamdagiya;

public class PassbyValue {
	public static void main(String[] args) {
		//pass by value. �����Ѵ�. (copy) <-�ڹٿ����� ������ �̰��̴�.
		//pass by reference <- c���� �ּ��� �̵�
		
		int x = 0;//0�� ����Ǿ�
		show(x);
		System.out.println("======");
		System.out.println(x);
	}//����� 0�� num���� ����.
	public static void show(int num){
		num = 100;
		System.out.println(num);
	}
}
 