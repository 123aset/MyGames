import java.util.Arrays;
import java.util.Random;

public class DummyBot extends PlayerThread {

    Random r = new Random();

    public DummyBot() {

    }

    @Override
    public Direction move() {
        DummyBot dummyBot = (DummyBot) PlayerThread.currentThread();
        Cell[] players1 = dummyBot.players;
        Cell player = players1[0];
        Cell[] garbages = dummyBot.garbages;
        garbages = sort(garbages);
        Direction[] directions = Direction.values();
        int randomDirection = r.nextInt(directions.length);
        return directions[randomDirection];
    }

    public Cell[] sort(Cell[] cells) {
        Arrays.sort(cells, (c1, c2) -> {
            Integer row1 = c1.row;
            Integer row2 = c2.row;
            Integer column1 = c1.column;
            Integer column2 = c2.column;
            int i = row1.compareTo(row2);
            if (i < 0)
                return column1.compareTo(column2);
            return i;
        });
        return cells;
    }

    public static void main(String[] args) {
        new DummyBot().start();
    }

}
