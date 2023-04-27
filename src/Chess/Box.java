package Chess;

public class Box {
    int x;
    int y;
    boolean isOccupied;
    Piece piece;

    public Box(int x, int y, boolean isOccupied, Piece piece) {
        this.x = x;
        this.y = y;
        this.isOccupied = isOccupied;
        this.piece = piece;
    }

    public  Box(int x,int y){
        this.x = x;
        this.y = y;
        this.isOccupied = false;
        this.piece = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
