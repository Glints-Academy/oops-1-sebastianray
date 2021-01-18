package Person;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("Burt Macklin", "Pawnee, IN");
		// Test Student class
		Student s1 = new Student("Sebastian Otoluwa", "Bandung, ID");
		s1.addCourseGrade("Javascript", 97);
		s1.addCourseGrade("C++", 78);
		s1.addCourseGrade("Golang", 88);
		s1.addCourseGrade("Golang", 88);
		s1.printGrades();
		System.out.println("Average is " + s1.getAverageGrade());

		// Test Teacher class
		Teacher t1 = new Teacher("Hasan Minhaj", "Davis, CA");
		t1.addCourse("PHP");
		t1.addCourse("Javascript");
		t1.addCourse("Golang");
		t1.addCourse("Javascript");
		t1.getCourses();

		// remove course
		t1.removeCourse("Javascript");
		t1.removeCourse("Golang");
		t1.removeCourse("Javascript");
		t1.getCourses();

		// Test polymorphism
		p1.introduce();
		s1.introduce();
		t1.introduce();
	}
}
