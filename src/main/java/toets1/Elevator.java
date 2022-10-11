package toets1;

import java.lang.reflect.Array;

public class Elevator {
    private String badge;

    public Elevator(String badge) {
        this.badge = badge;
    }

    public int[] activeButtons(int currentFloor) {
        if (badge.equals("")){
            return null;
        }
        return new int[]{0,4,10};

    }
}
