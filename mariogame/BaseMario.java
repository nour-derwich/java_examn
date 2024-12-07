public class BaseMario implements Mario {
    private MarioState currentState;
    private int health;
    private boolean invincible;

    public BaseMario() {
        this.health = 100;
        this.invincible = false;
        this.currentState = new NormalMarioState();
    }

    @Override
    public void move() {
        System.out.println("Mario is moving");
    }

    @Override
    public void jump() {
        System.out.println("Mario is jumping");
    }

    @Override
    public void attack() {
        System.out.println("Mario attacks");
    }
 @Override
    public boolean isInvincible() {
        return invincible;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        if (!invincible) {
            health -= damage;
            System.out.println("Mario took " + damage + " damage. Current health: " + health);
        }
    }
    public void setState(MarioState newState) {
        if (this.currentState != null) {
            this.currentState.exit(this);
        }
        this.currentState = newState;
        this.currentState.enter(this);
    }

    public MarioState getState() {
        return currentState;
    }
}