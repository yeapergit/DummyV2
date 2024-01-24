public class Row {

    private int x;
    private int y;

    public Row(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
