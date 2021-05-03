package week3homework;

public class StudentManager { 
	
	public void progressPercentage(Student student) {
		System.out.println("%"+student.getProgressCourse()+" ilerlediniz.");
	}
	
	public void loginStudent(Student student) {
		System.out.println(student.getName()+" giriş yaptınız.Hoşgeldiniz.");
	}

}
