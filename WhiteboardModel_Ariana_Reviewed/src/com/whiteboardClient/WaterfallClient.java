package com.whiteboardClient;

import com.whiteboard.Waterfall;
import com.whiteboard.WaterfallType;

/**
 * JR: good basic test-drive of a few valid instances.
 */
class WaterfallClient {

    //main
    public static void main(String[] args) {
        // instance 1 of Waterfall
        Waterfall niagaraFalls = new Waterfall("Niagara Falls");
        niagaraFalls.setHeight(2200.0);
        niagaraFalls.setType(WaterfallType.CASCADE);
        niagaraFalls.setLocation("NYC/Canada");
        niagaraFalls.setFreshWater(true);

        // instance 2 of Waterfall
        Waterfall denmarkStraitCataract = new Waterfall("Denmark Strait Cataract", "GreenLand", 11_500.0,
                WaterfallType.CASCADE);
        denmarkStraitCataract.setFreshWater(false);

        //Print niagara falls
        System.out.println(niagaraFalls);
        niagaraFalls.increaseOxygen();
        niagaraFalls.erode();

        System.out.println();

        //Print denmark falls
        System.out.println(denmarkStraitCataract);
        denmarkStraitCataract.increaseOxygen();
        denmarkStraitCataract.erode();
    }

}
