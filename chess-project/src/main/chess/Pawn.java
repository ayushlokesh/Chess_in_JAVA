package chess;

class Pawn extends Piece{
	private PieceColour colour;
	private String symbol;

	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♙";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♟";
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
		
		boolean isBlack = this.colour == PieceColour.BLACK;

		if (!Board.hasPiece(i1, j1) && j0 == j1){
			
			if ( (((i0 == 6 && (i1 == 4)) || (i1 == i0-1)) && !isBlack)
			 || (((i0 == 1 && (i1 == 3)) || (i1 == i0+1)) && isBlack))
			 return true;

		}

		else if (Board.hasPiece(i1, j1) && (Board.getPiece(i1, j1).colour != this.colour)
			    &&((j0 - j1) == 1) || ((j0 - j1) == -1)){

			if (((i1 - i0) == -1 && !isBlack) 
			    || ((i1 - i0) == 1 && isBlack))
				return true;

			}

		
		
		// else
			return false;
	}
}
