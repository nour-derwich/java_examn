package com.mariogame.states;

import com.mariogame.Mario;
import com.mariogame.MarioState;

public class InvincibleMarioState implements MarioState {
    @Override
    public void enter(Mario mario) {
        System.out.println("Entered Invincible Mario State");
    }

    @Override
    public void exit(Mario mario) {
        System.out.println("Exited Invincible Mario State");
    }

    @Override
    public void handleStateChange(Mario mario) {
        // Temporary invincibility logic
    }
}