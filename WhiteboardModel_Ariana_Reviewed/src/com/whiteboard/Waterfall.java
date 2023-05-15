package com.whiteboard;

import com.whiteboard.WaterfallType;

/**
 * JR: Good job overall.
 * Demonstrates good understanding of program concepts, with a few minor improvements needed.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been very good, keep it up.
 *
 * Class names, package names, and overall structure are not correct.
 *  No packages.//fixed
 *  Incorrect ValidationTest class name, should be WaterfallValidationTest.//fixed
 */

public class Waterfall {
    public static final Double MIN_HEIGHT = 1.0;
    //five attributes
    private String name;
    private Double height = MIN_HEIGHT;
    // JR: probably better to leave location null if unspecified
    private String location = "unknown";
    private boolean isFreshWater;
    private WaterfallType type = WaterfallType.CASCADE;

    // JR: this is never used anywhere
    private boolean hasAccess;

    // Constructors

    /*
     * JR: 5-arg ctor that takes 'isFreshWater' might be nice here, as well.
     */
    public Waterfall(String name) {
        setName(name);
    }

    public Waterfall(String name, String location) {
        this(name);
        setLocation(location);
    }

    public Waterfall(String name, String location, Double height, WaterfallType type) {
        this(name, location);
        setHeight(height);
        setType(type);
    }

    // Business methods
    public void increaseOxygen() {
        System.out.println(getName() + ": has a height of " + getHeight() +
                ". Based on this it increases oxygen in the water");
    }

    public void erode() {
        System.out.println(getName() + ": has erosion because it is a waterfall.");
    }

    public void accessed() {
        System.out.println("Have you accessed this waterfall?");
    }

    // accessor methods (getters/setters)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if (isValid(height)) {
            this.height = height;
        }
        else {
            System.out.printf("%s is not a valid height, the waterfall must " +
                            "have a height equal to or greater than %s \n",
                   height, MIN_HEIGHT);
        }
    }

    private static boolean isValid (Double height) {
        boolean isValid = false;
        if (height >= MIN_HEIGHT) {
            isValid = true;
        }
        return isValid;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFreshWater() {
        return isFreshWater;
    }

    public void setFreshWater(boolean freshWater) {
        isFreshWater = freshWater;
    }

    public WaterfallType getType() {
        return type;
    }

    public void setType(WaterfallType type) {
        this.type = type;
    }

    // To string method
    // JR: probably best to include all field values, e.g., isFreshWater is missing
    public String toString() {
        return String.format("Waterfall name=%s, location=%s, height=%s, type=%s",
                getName(), getLocation(), getHeight(), getType());
    }
}
