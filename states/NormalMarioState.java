package com.mariogame.states;

import com.mariogame.Mario;
import com.mariogame.MarioState;

public class NormalMarioState implements MarioState {
    @Override
    public void enter(Mario mario) {
        System.out.println("Entered Normal Mario State");
    }
     @Override
    public void exit(Mario mario) {
        System.out.println("Exited Normal Mario State");
    }

    @Override
    public void handleStateChange(Mario mario) {
        // Logic for state transitions
    }
}