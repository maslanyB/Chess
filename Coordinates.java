public class Coordinates {
    private int row;
    private int column;

    Coordinates(int row, int column){
        this.row = row;
        this.column = row;
    }
    /*
    static public Coordinates getPositions(Figure a){
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; i++){
                if(a == Board.identifyFigure(i,j)) return new Coordinates(i, j);
            }
        }
        return new Coordinates(9,9);
    }
    */


}
