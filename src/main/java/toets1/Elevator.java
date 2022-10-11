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
        if (badge.equals("S")) return new int[]{-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        return new int[]{0,4,10};

    }
}
