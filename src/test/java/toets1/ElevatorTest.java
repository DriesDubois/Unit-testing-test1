package toets1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ElevatorTest {

    @Test
    void testAccesFromUnauthorizedFloor (){
        Elevator elevator = new Elevator("405");
        int[] result= elevator.activeButtons(5);
        assertArrayEquals(null,result);
    }

    @Test
    void testAccesToFloorsFromBasement (){
        Elevator elevator = new Elevator("405");
        int[] result= elevator.activeButtons(-1);
        assertArrayEquals(new int[]{0,4,10},result);
    }

    @Test
    void testAccesToDifferentFloorFromBasement (){
        Elevator elevator = new Elevator("605");
        int[] result= elevator.activeButtons(-1);
        assertArrayEquals(new int[]{0,6,10},result);
    }

    @Test
    void testAccesToFloorFromLobby (){
        Elevator elevator = new Elevator("405");
        int[] result= elevator.activeButtons(0);
        assertArrayEquals(new int[]{4,10},result);
    }

    @Test
    void testAccesFromOwnFloor (){
        Elevator elevator = new Elevator("605");
        int[] result= elevator.activeButtons(6);
        assertArrayEquals(new int[]{0,10},result);
    }

    @Test
    void testBadgeNotScanned (){
        Elevator elevator = new Elevator("");
        int[] result= elevator.activeButtons(4);
        assertArrayEquals(null,result);
    }

    @Test
    void testBadgeOfStaffMember (){
        Elevator elevator = new Elevator("S");
        int[] result= elevator.activeButtons(4);
        assertArrayEquals(new int[]{-2,-1,0,1,2,3,4,5,6,7,8,9,10},result);
    }



}
