package Lecture5.HW;

import java.util.concurrent.atomic.AtomicInteger;

public class Fork extends AtomicInteger{
    private int number ;
    private volatile boolean  state;

    public Fork(int number) {
        this.number = number;
        this.state = true;
    }

    public int getNumber() {
        return number;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    public boolean isState() {
        return state;
    }

    @Override
    public String toString() {
        return "Fork " + number;
    }
}
