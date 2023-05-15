package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {
        //compare Televisions
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        
        //use == to show if they refer to the same physical object
        System.out.println(tvA == tvB); //you should see that it's false
        
        // equals() to show if they are 'equal' 
        System.out.println(tvA.equals(tvB)); //you should see that this is true now after override
        System.out.println();

        System.out.println(tvA.hashCode());
        System.out.println(tvB.hashCode());

        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        System.out.println(tvs.size());

    }
}
