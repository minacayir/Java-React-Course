package Mernis;

public class PersonValidation {

	public boolean ValidateByPersonalInfo(long nationalId, String firstName, String lastName, int yearOfBirth)
	{
		System.out.println(firstName + " " + lastName + " is valid person." );
		return true;
	}
}
