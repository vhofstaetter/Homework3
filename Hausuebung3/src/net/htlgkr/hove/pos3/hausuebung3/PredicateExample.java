package net.htlgkr.hove.pos3.hausuebung3;

import java.util.function.Predicate;

public class PredicateExample implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
