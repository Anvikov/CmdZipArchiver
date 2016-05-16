package ru.dormammu.edu.cmdziparchiver.controller;

import ru.dormammu.edu.cmdziparchiver.model.Direction;

/**
 * Created by User on 001 2016.05.01..
 */
public interface EventListener {
    void move(Direction direction);
    void restart();
    void startNextLevel();
    void levelCompleted(int level);
}
