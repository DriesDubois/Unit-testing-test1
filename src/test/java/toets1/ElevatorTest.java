package toets1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ElevatorTest {

    @Test
    void printBadgeNumber (){
        Elevator elevator = new Elevator("504");
        int[] result= elevator.activeButtons();
        assertArrayEquals(result,new int[]{5,0,4});
    }


}
