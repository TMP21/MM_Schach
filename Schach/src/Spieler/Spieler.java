package Spieler;

import Figur.Figur;

public class Spieler {

	private String team;
	private String name;
	private Figur[] figuren = new Figur[16];
	private int pos = 0;

	public Spieler(String t, String n) {
		this.team = t;
		this.name = n;
	}
	
	public void reset() {
		for(int i=0; i<figuren.length; i++) {
			figuren[i]=null;
		}
	}

	public Figur[] getFiguren() {
		return figuren;
	}

	public void addFigur(Figur f) {
		figuren[pos] = f;
		pos++;
	}

	public String getTeam() {
		return team;
	}

	public String getName() {
		return name;
	}

}
