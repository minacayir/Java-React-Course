package week3homework;

public class Student extends User{
      private String selectedCourses;
      private int progressCourse;

	public String getSelectedCourses() {
		return selectedCourses;
	}

	public void setSelectedCourses(String selectedCourses) {
		this.selectedCourses = selectedCourses;
	}

	public int getProgressCourse() {
		return progressCourse;
	}

	public void setProgressCourse(int progressCourse) {
		this.progressCourse = progressCourse;
	}
}
