package com.javalab.sec07;

public class Car2 {
    Tire tire;
    public void setTire(Tire tire) {
        this.tire =tire;
    }
    public void run() {
        tire.roll();
    }
}
