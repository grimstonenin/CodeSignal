package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class IsLuckyNumber {

    public boolean isLucky(int n){
        AtomicInteger sumOfFirstHalf = new AtomicInteger();
        AtomicInteger sumOfSecondHalf = new AtomicInteger();
        List<Integer> digits = new ArrayList<>();

        while(n > 0) {
            digits.add(n%10);
            n = n/10;
        }

        int half = digits.size()/2;
        digits.stream().limit(half).map(sumOfFirstHalf::addAndGet);
        digits.stream().skip(half).map(sumOfSecondHalf::addAndGet);


        return sumOfFirstHalf.get() == sumOfSecondHalf.get();
    }

}
