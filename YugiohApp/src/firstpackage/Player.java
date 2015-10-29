package firstpackage;

public class Player {

	public String name;
	public int gamesPlayed;
	public int gamesWon;
	public int currentLifepoints;
	
	public Player(String name){
		setName(name);
		setGamesPlayed(0);
		setGamesWon(0);
		setCurrentLifepoints(0);
	}
	
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public int getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
	public int getCurrentLifepoints() {
		return currentLifepoints;
	}
	public void setCurrentLifepoints(int currentLifepoints) {
		this.currentLifepoints = currentLifepoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
