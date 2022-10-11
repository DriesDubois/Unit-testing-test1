package toets1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Elevator {
    final private String badge;

    public Elevator(String badge) {
        this.badge = badge;
    }

    public int[] activeButtons(int currentFloor) {
        if (badge.equals("")){
            return null;
        }
        if (badge.equals("S")) return new int[]{-2,-1,0,1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> accessibleFloors = new ArrayList<>();
        for (int i = -2; i < 11 ; i++) {
            if (i==0 || i==10){
                accessibleFloors.add(i);
            }

        }
        accessibleFloors.add(Character.getNumericValue(badge.charAt(0)));
        accessibleFloors.remove(Integer.valueOf(currentFloor));
        Collections.sort(accessibleFloors);
        return convertIntegers(accessibleFloors);
    }

    public static int[] convertIntegers(ArrayList<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i);
        }
        return ret;
    }
}
