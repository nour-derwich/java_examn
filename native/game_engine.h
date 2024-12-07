#ifndef GAME_ENGINE_H
#define GAME_ENGINE_H

class GameEngine {
public:
    // Physics calculations
    double calculateTrajectory(double velocity, double angle);
    bool checkCollision(double x1, double y1, double x2, double y2);
    int calculateDamage(int baseAttack, int defense);
};
#endif