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



}
