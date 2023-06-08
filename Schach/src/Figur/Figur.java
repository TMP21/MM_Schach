package Figur;

public class Figur {

	protected String team;
	protected boolean geschlagen = false;
	protected int xPos;
	protected int yPos;

	public Figur(String team, int xPos, int yPos) {
		this.team = team;
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public boolean isGeschlagen() {
		return geschlagen;
	}

	public void setGeschlagen(boolean geschlagen) {
		this.geschlagen = geschlagen;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

}
