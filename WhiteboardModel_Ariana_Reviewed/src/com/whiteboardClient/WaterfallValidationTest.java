package com.whiteboardClient;

import com.whiteboard.Waterfall;

/**
 * JR: good job.
 *
 * Incorrect class name, should be WaterfallValidationTest.
 */
class WaterfallValidationTest {
    /*
     * Invalid waterfall heights are any number less than 1.0 EX. 0.0
     * Valid waterfall heights are any number above 1.0 Ex 1.0
     * Checked 2.0 as well because the default is 1.0
     */
    public static void main(String[] args) {
        Waterfall waterfall = new Waterfall("Niagara falls");
        waterfall.setHeight(0.0);
        System.out.println(waterfall);

        waterfall.setHeight(2.0);
        System.out.println(waterfall);

        waterfall.setHeight(1.0);
        System.out.println(waterfall);
    }

}
