public abstract class PowerUpDecorator implements Mario {
    protected Mario decoratedMario;

    public PowerUpDecorator(Mario mario) {
        this.decoratedMario = mario;
    }

    @Override
    public void move() {
        decoratedMario.move();
    }

    @Override
    public void jump() {
        decoratedMario.jump();
    }
     @Override
    public void attack() {
        decoratedMario.attack();
    }

    @Override
    public boolean isInvincible() {
        return decoratedMario.isInvincible();
    }

    @Override
    public int getHealth() {
        return decoratedMario.getHealth();
    }

    @Override
    public void takeDamage(int damage) {
        decoratedMario.takeDamage(damage);
    }
}