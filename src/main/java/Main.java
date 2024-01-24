public class Main {

    public static void main(String[] args) {
        final Row row = new Row(1,2);
        row.setX(5);
        row.setY(7);

        System.out.println(row.getX());
        System.out.println(row.getY());
    }
}
