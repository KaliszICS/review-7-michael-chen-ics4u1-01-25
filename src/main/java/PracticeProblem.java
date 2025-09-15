public class PracticeProblem {

	public static void main(String args[]) {

	}

	//Write your functions here
	public static String evenOrOdd(int a) {
		return a % 2 == 0 ? "Even" : "Odd";
	}

	public static String teacherOrStudent(String a) {
		return a == "Kalisz" ? "Teacher" : "Student";
	}

	public static int fartherFromZero(int a) {
		if (a < 0) {
			return a - 5;
		} else if (a > 0) {
			return a + 5;
		} else {
			return 0;
		}
	}

	public static String isFive(int a) {
		return a == 5 ? "The number is Five" : "The number is not Five";
	}

	public static String positiveOrNegative(double a) {
		return a > 0 ? "Positive" : "Negative";
	}

	public static String highOrLow(int a) {
		return a > 100 ? "High" : "Low";
	}

	public static String isHello(String a) {
		return a == "Hello" ? "The word is Hello" : "The word is not Hello";
	}
}
