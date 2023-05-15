package com.entertainment.client;

import com.entertainment.Television;

class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        System.out.println(tv1);

        Television tv2 = new Television("RCA", 10);
        tv2.changeChannel(9);
        System.out.println(tv2);
        
        //compare Televisions
        Television tvA = new Television("Sony", 50); 
        Television tvB = new Television("Sony", 50);
        
        //use == to show if they refer to the same physical object
        System.out.println(tvA == tvB); //you should see that it's false
        
        // equals() to show if they are 'equal' 
        System.out.println(tvA.equals(tvB)); //you should see that this is true now after override
    }
}
