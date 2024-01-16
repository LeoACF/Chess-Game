package chess;

public abstract class Piece {
	private boolean killed = false;
	private boolean white = false;
	
	public Piece(boolean white) {
		this.setWhite(white);
	}
	
	//simple class to indicate white pieces
	public boolean isWhite() {
		return this.white;
	}
	
	public void setWhite(boolean white) {
		this.white = white;
	}
	
	//classes of dead pieces 
	public boolean iskilled() {
		return this.killed;
	}
	public void setKilled(boolean killed) {
		this.killed = killed;
	}
	
	public abstract boolean canMove(Board board, Spot start, Spot end);	
}
//creation of the specific classes like King, Queen, bishop, etc.

