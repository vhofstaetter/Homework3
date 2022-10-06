package net.htlgkr.hove.pos3.hausuebung3;

import java.util.stream.IntStream;

public class Exercise4 {
    public static void main(String[] args) {
        final int result = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 != 0)
                .map(i -> i * i)
                .reduce(0, Integer::sum);
    }
}
