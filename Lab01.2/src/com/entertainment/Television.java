package com.entertainment;

import java.util.Objects;
/*
 * Natural order is defined by brand (String).
 */
public class Television implements Comparable<Television> {
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
    public int compareTo(Television other) {
        int result = this.getBrand().compareTo(other.getBrand());
        if (result == 0) {// if tied on brand, break the tie by volume.
            result = Integer.compare(this.getVolume(), other.getVolume())
;         }
        return result;
    }
/*
code written with Jay
    @Override
    public int hashCode() {

        //de
        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        // only proceed if 'obj' is a reference to another Television object (EXACT type match)
        if (this.getClass() == obj.getClass()) {
            //downcast 'obj' to more specific type Television, to call Television methods
            Television other = (Television) obj;

            // do the checks: business equality is defined as brand and volume are the same
            result = Objects.equals(this.getBrand(), other.getBrand()) && //null-safe check
                     this.getVolume() == other.getVolume(); //primitives cant be null
        }
        return result;
    }

*/

    @Override
    public boolean equals(Object obj) {
        // if I and obj are the same physical object
        if (this == obj) {
            return true;
        }
        // is obj null? OR
        // is obj a different type than me?
        // comparing Class objects is an EXACT type check (not an IS-A match)
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Television that = (Television) obj;

        return getVolume() == that.getVolume() &&
                Objects.equals(this.getBrand(), that.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
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
