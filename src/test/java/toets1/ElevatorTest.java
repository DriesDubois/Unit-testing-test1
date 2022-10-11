package toets1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ElevatorTest {

    @Test
    void printBadgeNumber (){
        Elevator elevator = new Elevator("504");
        int[] result= elevator.activeButtons(4);
        assertArrayEquals(result,new int[]{0,4,10});
    }

    @Test
    void testBadgeNotScanned (){
        Elevator elevator = new Elevator("");
        int[] result= elevator.activeButtons(4);
        assertArrayEquals(result,null);
    }

    @Test
    void testBadgeOfStaffMember (){
        Elevator elevator = new Elevator("S");
        int[] result= elevator.activeButtons(4);
        assertArrayEquals(result,new int[]{-2,-1,0,1,2,3,4,5,6,7,8,9,10});
    }



}
