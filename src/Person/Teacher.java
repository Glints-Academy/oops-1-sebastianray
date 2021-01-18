package Person;

public class Teacher extends Person {

	private int numCourses; // amount of course
	private String[] courses; // course subject
	private static final int MAX_COURSES = 10; // maximum courses

	// Constructor
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}

	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}

	public void introduce() {
		System.out.println(
				"Hello my name is " + super.getName() + ". I am a teacher" + ". I live in " + super.getAddress());
	}

	public boolean addCourse(String course) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}

	public boolean removeCourse(String course) {
		int courseIndex = numCourses;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courseIndex = i;
				break;
			}
		}
		if (courseIndex == numCourses) {
			return false;
		} else {
			for (int i = courseIndex; i < numCourses - 1; i++) {
				courses[i] = courses[i + 1];
			}
			numCourses--;
			return true;
		}
	}

	public void getCourses() {
		System.out.print(this + " Course(s):");
		for (int i = 0; i < numCourses; ++i) {
			System.out.print(" " + courses[i]);
		}
		System.out.println();
	}

}
