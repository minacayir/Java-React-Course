package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+"has been added.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+"has been updated.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+"has been deleted.");
		
	}

}
