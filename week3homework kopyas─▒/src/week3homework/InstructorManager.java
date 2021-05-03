package week3homework;

public class InstructorManager {
     public void addCourse(Instructor instructor) {
    	 System.out.println(instructor.getCourseName()+" kursu eklendi.");
     }
     
     public void updateCourse(Instructor instructor) {
    	 System.out.println(instructor.getCourseName()+" kursu güncellendi.");
     }
     
     public void deleteCourse(Instructor instructor) {
    	 System.out.println(instructor.getCourseName()+" kursu silindi.");
     }
}
