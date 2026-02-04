package com.interviewcake.solutions.p588;

public class SevenSideDice {

   public int rand5() {
        while (true) {
            int r = rand7();  // 1 to 7
            if (r <= 5) {
                return r;
            }
        }
    }

    public int rand7() {
        return (int)(Math.random() * 7) + 1;
    }

}
