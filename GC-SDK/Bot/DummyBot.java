
import java.util.Random;

public class DummyBot extends PlayerThread {

    Random r = new Random();

    @Override
    public Direction move() {
        Direction[] directions = Direction.values();
        int randomDirection = r.nextInt(directions.length);
        return directions[randomDirection];
    }
    
    public static void main(String[] args) {
        new DummyBot().start();
    }

}
