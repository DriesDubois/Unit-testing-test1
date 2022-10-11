package toets1;

import java.lang.reflect.Array;

public class Elevator {
    private String badge;

    public Elevator(String badge) {
        this.badge = badge;
    }

    public int[] activeButtons() {
        return new int[]{5,0,4};
    }
}
