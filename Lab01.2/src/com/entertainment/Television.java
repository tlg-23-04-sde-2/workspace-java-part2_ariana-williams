package com.entertainment;

import java.util.Objects;

public class Television {
    private String brand;
    private int volume;

    private Tuner tuner = new Tuner();

    //constructors

    public Television() {
    }

    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    //accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    @Override
    public int hashCode() {
//        return getBrand().length() + getVolume();
        //de
        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        // only proceed if 'obj' is a reference to a Television Object
        if (obj instanceof Television) {
            //downcast 'obj' to more specific type Television, to call Television methods
            Television other = (Television) obj;

            // do the checks: business equality is defined as brand and volume are the same
            result = Objects.equals(this.getBrand(), other.getBrand()) && //null-safe check
                     this.getVolume() == other.getVolume(); //primitives cant be null
        }
        return result;
    }



    //toString
    @Override
    public String toString() {
        return "Television[" +
                "brand='" + getBrand() +
                ", volume=" + getVolume() +
                ", currentChannel=" + getCurrentChannel() +
                ']';
    }
}
