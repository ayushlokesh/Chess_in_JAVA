package chess;

class Rook extends Piece{
	private PieceColour colour;
	private String symbol;

	public Rook(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♖";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♜";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		boolean pathClear = true;
		
		if ((Board.hasPiece(i1, j1) && (Board.getPiece(i1, j1).getColour() != this.colour)) 
		    || !Board.hasPiece(i1, j1))
		{if (i0 == i1){
			if (j1 > j0){
				for (int j = j0+1; j < j1; j++){
					pathClear = (!Board.hasPiece(i1, j));
							if (!pathClear)
					    return false;
				}
				return true;
			}
			else {
				for (int j = j0-1; j > j1; j--){
					pathClear = (!Board.hasPiece(i1, j));
							if (!pathClear)
					    return false; 
				}
				return true;
			
			}}



			else if (j0 == j1){
				if (i1 > i0){
					for (int i = i0+1; i < i1; i++){
						pathClear = (!Board.hasPiece(i, j1));
							if (!pathClear)
							return false;
					}
					return true;
				}
				else {
					for (int i = i0-1; i > i1; i--){
						pathClear = (!Board.hasPiece(i, j1));
							if (!pathClear)
							return false; 
					}
					return true;
				
				}}}


				return false;
		
	
	}
}