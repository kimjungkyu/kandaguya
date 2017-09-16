/**
 * 다중배열
 */
package kamdagiya;

public class TwoArray {
	public static void main(String[] args) {
		int[][] numbers = {
				{10,30,80},
				{1,3,8},
				{100,200,300}
		};
		System.out.println(numbers[0][1]);
		
		int[][][] numbers2 = {
				{
					{1,2,3},
					{1,2,3}
				},
				{
					{1,2,3},
					{1,2,3}
				}
		};
		System.out.println(numbers2[0][0][1]);
	}
}
