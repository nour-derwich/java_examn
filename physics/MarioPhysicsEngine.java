package com.mario.physics;

import com.mario.native_binding.NativeGameEngine;

public class MarioPhysicsEngine {
    private NativeGameEngine nativeEngine;

    public MarioPhysicsEngine() {
        nativeEngine = new NativeGameEngine();
    }

    public double calculateJumpTrajectory(double velocity, double angle) {
        return nativeEngine.calculateTrajectory(velocity, angle);
    }

    public boolean detectCollision(double x1, double y1, double x2, double y2) {
        return nativeEngine.checkCollision(x1, y1, x2, y2);
    }

    public int computeDamage(int attack, int defense) {
        return nativeEngine.calculateDamage(attack, defense);
    }
}