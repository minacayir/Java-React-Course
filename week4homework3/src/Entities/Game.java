package Entities;

import Abstract.IEntity;

public class Game implements IEntity{//implements Entity
	private int id;
	private String gameName;
	private double price;
	private String gameType;
	
	public Game() {
		
	}

	public Game(int id, String gameName, double price, String gameType) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.gameType = gameType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
	

}
