package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[10];
		input(students);
		print(students);
	}

	private static void print(Student[] students) {
		// TODO Auto-generated method stub
		System.out.println("List of 10 students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i + 1) + ": " + students[i].getName() + " - " + students[i].getAge()
                    + " years old - " + students[i].getAddress() + " - " + students[i].getPhoneNumber() + " - "
                    + students[i].getAverageScore() + " average score");
        }
    
	}

	private static void input(Student[] students) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhập vào thông tin của học sinh #" + (i + 1) + ":" );
			System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Average score: ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(name, age, address, phoneNumber, averageScore);
        }

        scanner.close();
		}
	
	}

