public class FireFlowerPowerUp extends PowerUpDecorator {
    public FireFlowerPowerUp(Mario mario) {
        super(mario);
    }

    @Override
    public void attack() {
        System.out.println("Mario launches fire balls!");
    }
}
