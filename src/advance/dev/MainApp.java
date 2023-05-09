package advance.dev;

import java.util.Scanner;

public class MainApp {

	 public static void main(String[] args) {
	        Student[] students = new Student[10];
	        input(students);
	        print(students);
	        sortByAverageScore(students);
	        System.out.println("Danh sách sinh viên sắp xếp theo điểm trung bình:");
	        print(students);
	    }
		public static void input(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
            System.out.println("Nhập thông tin học sinh #" + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = scanner.nextLine();
            System.out.print("Tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Địa Chỉ: ");
            String address = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Điểm trung bình: ");
            double averageScore = Double.parseDouble(scanner.nextLine());

            Student student = new Student(name, age, address, phoneNumber, averageScore);
            students[i] = student;
        }
        scanner.close();
    }

    public static void print(Student[] students) {
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Phone number: " + student.getPhoneNumber());
            System.out.println("Average score: " + student.getAverageScore());
            System.out.println("--------------------");
        }
    }

    public static void sortByAverageScore(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getAverageScore() > students[j].getAverageScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

   
	}


