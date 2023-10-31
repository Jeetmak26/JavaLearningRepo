package com.java.example;
public class CeilingFanImpl implements ICeilingFan{
    private int speed;
    private boolean isDirectionReversed;

    public CeilingFanImpl() {
        speed = 0; 
        isDirectionReversed = false;
    }

    public void changeSpeedCord() {
        if (speed == 0) {
            speed = 1; 
        } else if (speed < 3) {
            speed++; 
        } else {
            speed = 0; 
        }
    }

    public void changeDirectionCord() {
        isDirectionReversed = !isDirectionReversed; // 
    }

    public void fanStatus() {
        String direction = isDirectionReversed ? "Reversed" : "Forward";
        String speedLevel = speed == 0 ? "Off" : "Speed " + speed;
        System.out.println("Ceiling Fan is " + speedLevel + " and " + direction);
    }

    public static void main(String[] args) {
    	CeilingFanImpl fan = new CeilingFanImpl();

        fan.fanStatus();
        fan.changeSpeedCord();
        fan.fanStatus();
        fan.changeDirectionCord();
        fan.fanStatus();
        fan.changeSpeedCord();
        fan.fanStatus();
        fan.changeSpeedCord();
        fan.fanStatus();
        fan.changeSpeedCord();
        fan.fanStatus();
        fan.changeDirectionCord();
        fan.fanStatus();
        fan.changeSpeedCord();
        fan.fanStatus();
        fan.changeDirectionCord();
        fan.fanStatus();
        fan.changeDirectionCord();
        fan.fanStatus();
    }
}
