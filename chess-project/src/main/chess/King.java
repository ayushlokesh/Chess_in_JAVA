package chess;

public class King extends Piece{
	private PieceColour colour;
	private String symbol;

	public King(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♔";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♚";
		}
	}
	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		int difI = i1 - i0;
		int difJ = j1 - j0;

		if ((Board.hasPiece(i1, j1) && (Board.getPiece(i1, j1).getColour() != this.colour)) 
		    || !Board.hasPiece(i1, j1))
		{if ((difI == 0 || difI == 1 || difI == -1) && (difJ == 1 || difJ == -1 || difJ== 0))
		    return true;}
		
		return false;
	}

}
