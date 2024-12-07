public interface MarioState {
    void enter(Mario mario);
    void exit(Mario mario);
    void handleStateChange(Mario mario);
}
