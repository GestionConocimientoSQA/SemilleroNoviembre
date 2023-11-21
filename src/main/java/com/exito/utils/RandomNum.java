package com.exito.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNum {

    public static int randomNumberInRange (int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
