import java.util.stream.*;

public class Arrays{


	public static int[] intArray = {3, 6, 34};
	public static int sum = IntStream.of(intArray).sum();
	public static int length = intArray.length;
	public static double average = sum/length;
	public static String[] stringArray = {"Marcus", "Andreas", "Christian"};
	public static boolean[] booleanArray = {true, false, false};
	

	public static void main(String[] args){
	

	System.out.println(stringArray);
	System.out.println("The sum is " + sum);
	System.out.println("The average is " + average);

	}

	public static String[] getNames(String[] stringArray) {
		return stringArray;
	}

	public static int[] getSum(int[] intArray) {
		return intArray;
	}

	public static int[] getAverage(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		return intArray;
	}
}