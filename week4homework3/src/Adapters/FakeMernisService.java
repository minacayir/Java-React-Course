package Adapters;

import Abstract.ICheckUserService;
import Entities.Gamer;
import Mernis.PersonValidation;

public class FakeMernisService implements ICheckUserService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
      PersonValidation checkPerson = new PersonValidation();
		
		boolean result = true;
		try {
			result = checkPerson.ValidateByPersonalInfo(Long. parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
		
		
		
		
		
		}

}
