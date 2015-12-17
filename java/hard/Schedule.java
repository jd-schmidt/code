public class Schedule {
	public static void main(String[] args) {
	// Program to print out a fake scheudle

	int border = 51;
	String[] classes = {"Math","Science","Computer Science","Dodgeball","Woodshop","Social Studies","Reading"};
	String[] teacher = {"Mr. Loeber","Mr Willig","Miss Agee","Mr. Sullivan","Mr. Johns","Another Teacher", "Another person"};

	printBorder(border);
	for (int i=0 ; i < classes.length ; i++) {

		System.out.printf("| %2d  | %-20s | %-20s |\n", i, classes[i], teacher[i]);

	}
	printBorder(border);
	
	}
	private static void printBorder(int n) {
		printplus();
		for(int i = 0 ; i < n ; i++ ) {
			System.out.printf("-");
		}
		
		printplus();
		System.out.println();
	}
	private static void printplus() {
		System.out.printf("+");
	}
}
