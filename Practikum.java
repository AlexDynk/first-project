public class HelloWorld {

	public static void main(String[] args) {

		float i = 6;
		float j = 7;
		float answer = i / j;
		
		String message = "Hello world!";
		String stringAnswer = message + " " + answer;
		
		boolean isMoreThanOne;
		if (answer > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		
		System.out.println(message);
		System.out.println(stringAnswer + " " + isMoreThanOne);
		System.out.println("Тестирую GIT");
		
		
	}

}