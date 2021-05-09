package Concrete;

import Abstract.ICheckUserService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {

	private ICheckUserService checkUserService;
	
	
	
	
	
	public GamerManager(ICheckUserService checkUserService) {
		super();
		this.checkUserService = checkUserService;
	}

	@Override
	public void add(Gamer gamer) {
		
			if(checkUserService.CheckIfRealPerson(gamer)) {
				System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " added");
			}else {
				System.out.println("Failed.");
			}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+"has been deleted.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+"has been updated.");
		
	}

}
