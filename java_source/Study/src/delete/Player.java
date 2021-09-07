package delete;

public class Player {
	private PlayerLevel level; //¸â¹ö º¯¼ö
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
}
