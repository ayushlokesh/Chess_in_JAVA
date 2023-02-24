package chess;

public class Bishop extends Piece{
	private PieceColour colour;
	private String symbol;

	public Bishop(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♗";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♝";
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
		boolean pathClear = true;
		int difI = i1 - i0;
		int difJ = j1 - j0;



		if ((Board.hasPiece(i1, j1) && (Board.getPiece(i1, j1).getColour() != this.colour)) 
		    || !Board.hasPiece(i1, j1))

		{if (difI > 0){

			if (difJ > 0 && difJ==difI){
				for (int j = j0+1, i = i0+1; j < j1 && i < i1; i++,j++){
					if (pathClear)
						pathClear = (!Board.hasPiece(i, j));
					else
					    return false;
				}
				return true;
			}

			else if (difJ < 0 && (-1)*difJ==difI){
				for (int j = j0-1, i = i0+1; j > j1 && i < i1; i++,j--){
					if (pathClear)
						pathClear = (!Board.hasPiece(i, j));
					else
					    return false;
				}
				return true;
			}
			
		} 

		else if (difI < 0){

			if (j1 - j0 > 0 && (-1)*difI==difJ){
				for (int j = j0+1, i = i0-1; j < j1 && i > i1; i--,j++){
					if (pathClear)
						pathClear = (!Board.hasPiece(i, j));
					else
					    return false;
				}
				return true;
			}

			else if (difJ < 0 && difJ==difI){
				for (int j = j0-1, i = i0-1; j > j1 && i > i1; i--,j--){
					if (pathClear)
						pathClear = (!Board.hasPiece(i, j));
					else
					    return false;
				}
				return true;
			}
			
			
		}} 
		
		return false;

		
	}
}
