package lifepoint.counter;

public class Player {
	private int lifepoints;
	private int gamesPlayed;
	private int wins;
	private String name;
	
	
	// Constructors
	public Player() {
		name = "Unknown Player";
		lifepoints = 8000;
		gamesPlayed = 0;
		wins = 0;
	}
	
	public Player(String anyName) {
		name = anyName;
		lifepoints = 8000;
		gamesPlayed = 0;
		wins = 0;
	}
	
	
	
	// Getters/Setters
	public int getLifepoints() {
		return lifepoints;
	}
	public void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
	}
	public int getGamesPlayed() {
		return this.gamesPlayed;
	}
	public int getWins() {
		return this.wins;
	}
	public String getName() {
		return name;
	}
	
	
	// Other Methods
	public void addLP(int anyInt) {
		this.setLifepoints(this.getLifepoints() + anyInt);
	}
	public void addGame(int anyInt) {
		this.gamesPlayed += anyInt;
		
	}
	public void addWin(int anyInt) {
		this.wins += anyInt;
	}
	
}
