package com.whiteboardClient;

import com.whiteboard.Waterfall;
import com.whiteboard.WaterfallType;

import java.util.Arrays;
import java.util.Locale;

/**
 * Goal:
 * create an instance of waterfall with the specification (values) provided by the user
 */

/**
 * JR: good job, works as expected, and usage banner is good.
 *
 * Good that 'note1' doesn't hardcode the options.
 * 'note2' seems unnecessary, since 'hasAccess' is not one of your expected arguments.// fixed
 */
class WaterfallClientArgs {
    public static void main(String[] args) {
        // first must check that the args provided are at least 1
        if (args.length < 4) {
            String usage = "Usage: java WaterfallClientArgs <name> <location> <height> <type> ";
            String example = "Example: java WaterfallClientArgs Niagarafalls NewYork 2200.0 CASCADE ";
            String note1 = "Valid types are " + Arrays.toString(WaterfallType.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            return;
        }

        // convert arguments to into proper types
        String name = args[0];
        String location = args[1];
        double height = Double.parseDouble(args[2]);
        WaterfallType type = WaterfallType.valueOf(args[3].toUpperCase());

        // Create a Waterfall object from these ingredients
        Waterfall waterfall = new Waterfall(name, location, height, type);

        // Print the object and let the water flow
        System.out.println(waterfall);
        System.out.println("Relax and enjoy the waterfall");
    }

}
