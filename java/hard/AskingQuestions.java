import java.util.Scanner;
public class AskingQuestions {
	public static void main(String[] args) {
	//Do stuff
	Scanner scanner = new Scanner(System.in);

	int age;
	String height;
	double weight;

	System.out.print("How old are you? ");
	age = scanner.nextInt();

	System.out.print("How tall are you? ");
        height = scanner.next();

	System.out.print("How much do you weight? ");
	weight = scanner.nextDouble();

	System.out.printf (" So you're %d years old, and %s tall, and weight %2.0f pounds.%n", age, height, weight);

	}
}
