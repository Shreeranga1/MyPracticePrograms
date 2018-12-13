package Practice;

public class SayHello {

	public static void main(String[] args) {
		System.out.println("Hello");
		Runnable run = () -> System.out.println("Hello , HII,good morning");
		run.run();
	}

}
