/**
 * �ݺ��� for
 */
package kamdagiya;

public class BanbockFor {
	public static void main(String[] args) {

		for (int x = 0; x < 10; x++) {
			System.out.print(x);
		}
		System.out.println("�ݺ����� ���ᰡ �Ǿ����ϴ�.");

		for (int y = 10; y > 0; y--) {
			System.out.print(y);
			if( y==3){
				break;
			}
		}
		System.out.println("�ݺ����� ���ᰡ �Ǿ����ϴ�.");
	}
}
