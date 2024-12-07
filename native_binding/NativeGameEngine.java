package com.mario.native_binding;

public class NativeGameEngine {
    // Load native library
    static {
        System.loadLibrary("gameengine");
    }

    // Native method declarations
    public native double calculateTrajectory(double velocity, double angle);
    public native boolean checkCollision(double x1, double y1, double x2, double y2);
    public native int calculateDamage(int baseAttack, int defense);
}