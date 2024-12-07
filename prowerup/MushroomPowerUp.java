ackage com.mariogame.powerups;

import com.mariogame.Mario;
import com.mariogame.PowerUpDecorator;

public class MushroomPowerUp extends PowerUpDecorator {
    public MushroomPowerUp(Mario mario) {
        super(mario);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Mario grows larger with mushroom power!");
    }

    @Override
    public int getHealth() {
        return super.getHealth() + 50; // Increase health
    }
}