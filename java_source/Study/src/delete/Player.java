package delete;

public class Player {
	private PlayerLevel level; //��� ����
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
}
