package math;

import gopaljilab.dsa.math.FindClosestPerson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindClosestPersonTest {
    @Test
    public void WhenXReachesFirst(){
        FindClosestPerson findClosestPerson = new FindClosestPerson();
        int xAxis = 2, yAxis = 7, zAxis = 4;
        int expected = 1;
        int actual = findClosestPerson.getClosest(xAxis, yAxis, zAxis);
        assertEquals(expected,actual,"The result of xAxis = 2, yAxis = 7, zAxis = 4 should be 1");
    }

    @Test
    public void WhenYReachesFirst(){
        FindClosestPerson findClosestPerson = new FindClosestPerson();
        int xAxis = 2, yAxis = 5, zAxis = 6;
        int expected = 2;
        int actual = findClosestPerson.getClosest(xAxis, yAxis, zAxis);
        assertEquals(expected,actual,"The result of xAxis = 2, yAxis = 5, zAxis = 6 should be 2");
    }

    @Test
    public void WhenXAndYReachesSameTime(){
        FindClosestPerson findClosestPerson = new FindClosestPerson();
        int xAxis = 1, yAxis = 5, zAxis = 3;
        int expected = 0;
        int actual = findClosestPerson.getClosest(xAxis, yAxis, zAxis);
        assertEquals(expected,actual,"The result of xAxis = 1, yAxis = 5, zAxis = 3 should be 0");
    }




}
