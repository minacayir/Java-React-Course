package week3homework;

public class Main {

	public static void main(String[] args) {
		
		User user= new User();
		user.setName("Merve");
		user.setLastName("Çayır");
		user.setId(22222);
		user.setEmail("bbbbb@gmail.com");
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setId(12345);
		instructor.setCourseName("Java React");
		instructor.setEmail("aaaaa@gmail.com");
		
		Student student = new Student();
		student.setName("Mina");
		student.setLastName("ÇAYIR");
		student.setId(11111);
		student.setProgressCourse(56);
		student.setEmail("mina@gmail.com");
		student.setSelectedCourses("Java React");
		
		UserManager userManager =new UserManager();
		userManager.addUser(user);
		userManager.deleteUser(student);
		userManager.updateUser(instructor);
		
		StudentManager studentManager= new StudentManager();
		studentManager.loginStudent(student);
		studentManager.progressPercentage(student);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.deleteCourse(instructor);
		instructorManager.updateCourse(instructor);
		
		
		
		
	}

}
