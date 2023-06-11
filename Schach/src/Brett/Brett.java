package Brett;

import Figur.*;
import Spieler.*;

public class Brett {

	private Figur[][] spielFeld = new Figur[8][8];
	private Spieler blackPlayer = new Spieler("black", "a");
	private Spieler whitePlayer = new Spieler("white", "a");

	public Brett() {
		startUpBlack();
		startUpWhite();
	}

	public void startUpWhite() {
		for (int i = 0; i < 8; i++) {
			spielFeld[i][6] = new Bauer("white", i, 6);
		}
		spielFeld[0][7] = new Turm("white", 0, 7);
		spielFeld[1][7] = new Springer("white", 1, 7);
		spielFeld[2][7] = new Läufer("white", 2, 7);
		spielFeld[3][7] = new Königin("white", 3, 7);
		spielFeld[4][7] = new König("white", 4, 7);
		spielFeld[5][7] = new Läufer("white", 5, 7);
		spielFeld[6][7] = new Springer("white", 6, 7);
		spielFeld[7][7] = new Turm("white", 7, 7);
	}
	
	public void startUpBlack() {
		for (int i = 0; i < 8; i++) {
			spielFeld[i][1] = new Bauer("black", i, 1);
		}
		spielFeld[0][0] = new Turm("black", 0, 0);
		spielFeld[1][0] = new Springer("black", 1, 0);
		spielFeld[2][0] = new Läufer("black", 2, 0);
		spielFeld[3][0] = new Königin("black", 3, 0);
		spielFeld[4][0] = new König("black", 4, 0);
		spielFeld[5][0] = new Läufer("black", 5, 0);
		spielFeld[6][0] = new Springer("black", 6, 0);
		spielFeld[7][0] = new Turm("black", 7, 0);
	}

	public Figur[][] getSpielFeld() {
		return spielFeld;
	}

	public void resetFeld() {
		blackPlayer.reset();
		whitePlayer.reset();
		startUpBlack();
		startUpWhite();
	}

}
