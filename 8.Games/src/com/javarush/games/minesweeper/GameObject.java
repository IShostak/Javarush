package com.javarush.games.minesweeper;

public class GameObject {
    public int x,y;
    public boolean isMine;

    public GameObject(int x, int y, boolean b) {
        this.x = x;
        this.y = y;
        this.isMine = b;
    }
}
