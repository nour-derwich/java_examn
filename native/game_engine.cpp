#include "GameEngine.h"
#include <cmath>

double GameEngine::calculateTrajectory(double velocity, double angle) {
    const double GRAVITY = 9.8;
    return (velocity * velocity * std::sin(2 * angle)) / GRAVITY;
}

bool GameEngine::checkCollision(double x1, double y1, double x2, double y2) {
    double distance = std::sqrt(std::pow(x2 - x1, 2) + std::pow(y2 - y1, 2));
    return distance < 10.0;
}

int GameEngine::calculateDamage(int baseAttack, int defense) {
    return std::max(0, baseAttack - defense);
}