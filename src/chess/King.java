package chess;

public class King extends Piece{
	
	private boolean castlingDone = false;
	
	public King(boolean white) {
		super(white);
	}
	// TODO Auto-generated constructor stub
	public boolean iscastlingDone() {
		return this.castlingDone;
	}
	public void setCastlingDone(boolean castlingDone) {
		this.castlingDone = castlingDone;
	}
	//determining the movements of each piece
	@Override
	public boolean canMove(Board board, Spot start, Spot end) {
	
		//preventing pieces with equal color from moving to the same spot
		if(end.getPiece().iswhite() == this.iswhite()) {
			return false;
		}
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());			
		if (x + y == 1) {
			return true;
		}
		return false;
	}
}