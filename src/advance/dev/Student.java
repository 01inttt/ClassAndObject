package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private double averageScore;
	public Student(String name, int age, String address, String phoneNumber, double averageScore) {
		this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.averageScore = averageScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		if (averageScore >= 0) {
            this.averageScore = averageScore;
        } else {
            System.out.println("Invalid average score");
        }
	}
	
}
