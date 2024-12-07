public class StarPowerUp extends PowerUpDecorator {
    public StarPowerUp(Mario mario) {
        super(mario);
    }

    @Override
    public boolean isInvincible() {
        return true;
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Star power prevents damage!");
    }
}