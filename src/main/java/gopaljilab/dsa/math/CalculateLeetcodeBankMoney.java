package gopaljilab.dsa.math;

public class CalculateLeetcodeBankMoney {
    public int totalMoney(int n) {
        /* int totalMoney = 0;
        int weeks = 0;
        while (n > 0){
            for (int day = 1; day <= 7 && n > 0; day++) {
                totalMoney += weeks + day;
                n--;
            }
            weeks++;
        }
        return totalMoney;
        */

        int weeks = n / 7; // total weeks
        int days = n % 7; // leftover days
        int totalWeeks = weeks * (49 + 7 * weeks) / 2;  // total from all full weeks
        int totalDays = days * (2 * (weeks + 1) + (days - 1)) / 2; // leftover days

        return totalWeeks + totalDays;
    }
}
