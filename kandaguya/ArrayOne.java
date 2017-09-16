/**
 * 1차배열
 */
package kamdagiya;

public class ArrayOne {
	public static void main(String[] args) {
		int[] numbers = new int[3];
	numbers[0] =4;
	numbers[1] =10;
	numbers[2] =20;
	System.out.println(numbers[2]);
	
	String[] inventory = new String[2];
	inventory[0] = "검";
	inventory[1] = "방패";
	System.out.println(inventory[0]);
	
	String[] fruits = {"apple","orange"};
	System.out.println(fruits[0]);
	
	for (int x = 0 ; x < numbers.length; x++){
		System.out.println(numbers[x]);
	}
		
	for (String text : fruits)
	 System.out.println(text);
	}
}
