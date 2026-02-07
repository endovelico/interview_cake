package com.interviewcake.solutions.p587;

import java.util.Random;

public class FiveSidedDie {

    private static Random rand = new Random();

    // Simulates rand7(): returns 1 through 7 uniformly
    public static int rand7() {
        return rand.nextInt(7) + 1; // 0..6 + 1 -> 1..7
    }

    // Simulates rand5(): returns 1 through 5 uniformly
    public static int rand5() {
        while (true) {
            int r = rand7();
            if (r <= 5) {
                return r;
            }
            // If r is 6 or 7, retry
        }
    }
}
