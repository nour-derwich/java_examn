public class GameDemo {
    public static void main(String[] args) {
        // Create base Mario
        Mario mario = new BaseMario();
        
        // Apply power-ups
        mario = new MushroomPowerUp(mario);
        mario = new FireFlowerPowerUp(mario);
        mario = new StarPowerUp(mario);

        // Demonstrate capabilities
        mario.move();
        mario.attack();
        mario.takeDamage(50);
    }
}