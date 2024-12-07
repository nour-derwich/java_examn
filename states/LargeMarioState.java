package com.mariogame.states;

import com.mariogame.Mario;
import com.mariogame.MarioState;

public class LargeMarioState implements MarioState {
    @Override
    public void enter(Mario mario) {
        System.out.println("Entered Large Mario State");
    }
     @Override
    public void exit(Mario mario) {
        System.out.println("Exited Large Mario State");
    }

    @Override
    public void handleStateChange(Mario mario) {
        // Can break blocks, more health
    }
}