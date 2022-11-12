import java.util.Scanner;
public class GPACalculator {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int classes = 0;
	int hours = 0;
	double totalHours = 0;
	double grade = 0;
	double gpa = 0;
	double quality = 0;
	System.out.println("How many classes are you taking this semester?");
	classes = input.nextInt();
	
	for (int i = 1; i < (classes+1); i++) {
		System.out.println("Class " + i + ": Number of credit hours?");
		hours = input.nextInt();
		System.out.println("Class " + i + ": Your numerical final grade?");
		grade = input.nextDouble();
		System.out.println("");
		totalHours = totalHours + hours;
		if (grade < 101 && grade >= 90)
			quality = quality + 4 * hours;
		else if (grade < 90 && grade >= 80)
			quality = quality + 3 * hours;
		else if (grade < 80 && grade >= 70)
			quality = quality + 2 * hours;
		else if (grade < 70 && grade >=60)
			quality = quality + 1 * hours;
		else if (grade < 60 && grade >= 0)
			quality = quality + 0 * hours;
	}
	System.out.println("Your GPA this semester is " + (quality / totalHours));
	if (totalHours >= 12 && gpa >= 3.5)
		System.out.println("You made the Dean's List! :)");
	else
		System.out.println("Sorry, you didn't make the Dean's List :(");
	

	}

}
