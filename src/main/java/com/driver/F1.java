package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Race Car", 1); // Using arbitrary values for unspecified parameters
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed == 0) {
            super.stop();
            changeGear(1);
        } else if (newSpeed >= 1 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed >= 51 && newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed >= 101 && newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed >= 151 && newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed >= 201 && newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
