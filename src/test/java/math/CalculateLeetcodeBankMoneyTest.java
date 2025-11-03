package math;

import gopaljilab.dsa.math.CalculateLeetcodeBankMoney;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateLeetcodeBankMoneyTest {
    @Test
    public void TestBaseCase(){
        CalculateLeetcodeBankMoney calculateMoney = new CalculateLeetcodeBankMoney();
        int n = 4;
        int expected = 10;
        int actual = calculateMoney.totalMoney(n);
        assertEquals(expected, actual, "");
    }

    @Test
    public void TestCheckFrom20DaysCase(){
        CalculateLeetcodeBankMoney calculateMoney = new CalculateLeetcodeBankMoney();
        int n = 20;
        int expected = 96;
        int actual = calculateMoney.totalMoney(n);
        assertEquals(expected, actual, "Total amount of bank should be 9");
    }

    @Test
    public void TestIfWeHadMaximumDaysCase(){
        CalculateLeetcodeBankMoney calculateMoney = new CalculateLeetcodeBankMoney();
        int n = 20;
        int expected = 96;
        int actual = calculateMoney.totalMoney(n);
        assertEquals(expected, actual, "Total amount of bank should be 9");
    }

    @Test
    public void TestLessMaximumDaysCase(){
        CalculateLeetcodeBankMoney calculateMoney = new CalculateLeetcodeBankMoney();
        int n = 20;
        int expected = 96;
        int actual = calculateMoney.totalMoney(n);
        assertEquals(expected, actual, "Total amount of bank should be 9");
    }
}
