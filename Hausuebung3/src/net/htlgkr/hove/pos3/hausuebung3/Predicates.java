package net.htlgkr.hove.pos3.hausuebung3;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {
        final Predicate<Integer> isEven = i -> (i % 2 == 0);
        final Predicate<Integer> isPositive = i -> (i > 0);
        final Predicate<String> isShortWord = s -> (s.length() <= 4);

        boolean evenPositiv = isEven.and(isPositive).test(5);
        boolean unevenPositive = isPositive.and(isEven).negate().test(20);
    }
}
