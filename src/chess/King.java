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
		if(end.getPiece().isWhite() == this.isWhite()) {
			return false;
		}
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());			
		if (x + y == 1) {
			return true;
		}
		return this.isValidCastling(board, start, end);
	}
	private boolean isValidCastling(Board board, Spot start, Spot end) {
		if(this.iscastlingDone()) {
			return false;
		}
		else{
			return true;
		}
	}
	public boolean isCastlingMove(Spot start, Spot end) {
		return true;
	}
}