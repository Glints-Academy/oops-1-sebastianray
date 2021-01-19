package Person;

public class Student extends Person {

	private int numCourses; // amount course(s) taken
	private String[] courses; // course subject
	private int[] grades; // student's score
	private static final int MAX_COURSES = 30; // max courses can be taken

	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}

	@Override
	public String toString() {
		return "Student: " + super.toString();
	}

	public void introduce() {
		System.out.println(
				"Hello my name is " + super.getName() + ". I am a student" + ". I live in " + super.getAddress());
	}

	public boolean addCourseGrade(String course, int grade) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
		return true;
	}

	public void printGrades() {
		System.out.print(this);
		for (int i = 0; i < numCourses; ++i) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}

	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}
		return (double) sum / numCourses;
	}
}
