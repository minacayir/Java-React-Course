package week3homework;

public class UserManager { 
	public void addUser(User user) {
		System.out.println(user.getName()+" "+user.getLastName()+" "+"kullanıcısı eklendi.");
	}
	
	public void updateUser(User user) {
		System.out.println(user.getName()+" "+user.getLastName()+" "+"kullanıcısı güncellendi.");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getName()+" "+user.getLastName()+" "+"kullanıcısı silindi.");
	}

}
