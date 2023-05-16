package com.entertainment.client;

import com.entertainment.Television;
import com.entertainment.TelevisionChannelComparator;

import java.util.*;

class TelevisionClient {
    public static void main(String[] args) {
        //compare Televisions
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        Television tvC = new Television("Sony", 52);
        Television tvD = new Television("Sony", 12);
        
        //use == to show if they refer to the same physical object
        System.out.println(tvA == tvB); //you should see that it's false
        
        // equals() to show if they are 'equal' 
        System.out.println(tvA.equals(tvB)); //you should see that this is true now after override
        System.out.println();

        Set<Television> tvs = new TreeSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        tvs.add(tvC);
        tvs.add(tvD);

        System.out.println("size of set " + tvs.size());

        for (Television currTv : tvs) {
            System.out.println(currTv);
        }

    }
}
